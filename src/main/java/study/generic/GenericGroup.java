package study.generic;

public class GenericGroup {


    Group<String> group = new Group();
    Group<User> group1 = new Group();
    Group<Group> qwe = new Group<Group>();
    //Group<Group> user = new Group<User>();
    Group<Group> userte = new User<Group>();


    public static void main(String[] args) {
        Game gate = new Game();
    }
    public static class Game{
    }
    ///
    public static class LoL extends Game implements Rankable{
    }
    ///
    public static  class WoW extends Game{
    }
    ///
    public  interface Rankable{
    }
}
