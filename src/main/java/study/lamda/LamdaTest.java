package study.lamda;

import java.util.EnumSet;

public class LamdaTest {

    public static void main(String[] args) {

        Game game = new Game();
        LamdaTest.testMethod();
        System.out.println(game);;
        new Game().running(new Setting() {
            @Override
            public void setup() {
                System.out.println("before playing setup");
            }
        });

        int pay = 61500000;
        for (int i = 0; i < 10; i++)
        {
            pay *= 1.05;
        }
        System.out.println(pay);

    }

    public static void testMethod() {
        System.out.println("test Method");


    }


}

@FunctionalInterface
interface Setting{
    void setup();
}

class Game {
    public void running(Setting setting){
        setting.setup();
        System.out.println("playing game");
    }
}