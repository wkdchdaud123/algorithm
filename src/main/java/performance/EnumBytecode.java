package performance;

public class EnumBytecode {


    public static void main(String[] args) {

        System.out.println(MacaronTaxi.MIDDLE);

        System.out.println(MacaronTaxi.valueOf("BIG"));
        System.out.println(MacaronTaxi.values().length);
        System.out.println(MacaronTaxi.MIDDLE.getName());
        System.out.println(MacaronTaxi.MIDDLE.test("asd"));
    }
}

enum MacaronTaxi {
    MIDDLE("중형", 3800){
        String test(String value){
            return value;
        }
    },
    BIG("대형",4500){
        String test(String value){
            return value;
        }
    },
    MOBUM("모범",5500){
        String test(String value){
            return value;
        }
    };

    final private String name;
    final private int defaultPrice;

    public String getName(){
        return this.name;
    }

    MacaronTaxi(String name, int defaultPrice){
        this.name = name;
        this.defaultPrice = defaultPrice;
    }

    abstract String test(String value);

}
