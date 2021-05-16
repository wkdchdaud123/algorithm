package performance;

import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedStudy {

    public static void main(String[] args) {


        ExplicitCount count = new ExplicitCount();
        //MethodLockCount methodLockCount = new MethodLockCount();
        //ImplicitCount implicitCount = new ImplicitCount();
        for (int i = 0; i < 100; i++) {
            new Thread(){
                public void run(){
                    for (int j = 0; j < 1000; j++) {
                        //System.out.println("methodLock: " +methodLockCount.view());
                        System.out.println(count.view());
                        //System.out.println(implicitCount.view());
                    }
                }
            }.start();
        }



    }

}

class MethodLockCount {
    private int count;
    public synchronized int view() {return count++;}
}
class ImplicitCount {
    private int count = 0;
    private Lock lock = new ReentrantLock();
    public int view() {
        return count++;
    }
    public Lock getLock(){
        return lock;
    };

}

class ExplicitCount {
    private Integer count = 0;
    public int view() {
        synchronized (this) { //0x1123
            //count//0x1124 = this.count0x1123+1;
            return count++; //0x1124
        }
    }
}