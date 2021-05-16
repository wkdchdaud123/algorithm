package study.generic;


///
public class Play<T>{
    public static void main(String[] args){
        Play<?> lolPlay = new Play<>();
        lolPlay.doSomething(new Play<LoL>());
        lolPlay.doSomething(new Play<Game>());
        lolPlay.doSomething(new Play<Rankable>());
        lolPlay.doSomething(new Play<Rankable>());
        //lolPlay.doSomething(new Play<WoW>());
    }

    public void doSomething(Play<? super LoL> play){
        System.out.println(play);
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
    public interface Rankable{
    }
}

