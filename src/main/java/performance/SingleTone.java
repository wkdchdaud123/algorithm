package performance;

public class SingleTone {


    public static void main(String[] args) {
        SingleTone st1 = getInstance();
        SingleTone st2 = getInstance();
        System.out.println(st1.toString());
        System.out.println(st1.hashCode());
        String qwe = "wkd";
        qwe.hashCode();
    }
    private SingleTone() {}

    public static SingleTone getInstance() {
        return new SingleTone();
    }

    public static final SingleTone instance = new SingleTone();

}
