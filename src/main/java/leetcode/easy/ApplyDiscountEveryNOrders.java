package leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/apply-discount-every-n-orders/
public class ApplyDiscountEveryNOrders {

    public static void main(String[] args) {

        Cashier cashier = new Cashier(
            3,
            50,
            new int[]{1,2,3,4,5,6,7},
            new int[]{100,200,300,400,300,200,100}
        );

        System.out.println(cashier.getBill(new int[]{1,2},new int[]{1,2}));                        // return 500.0, bill = 1 * 100 + 2 * 200 = 500.
        System.out.println(cashier.getBill(new int[]{3,7},new int[]{10,10}));                      // return 4000.0
        System.out.println(cashier.getBill(new int[]{1,2,3,4,5,6,7},new int[]{1,1,1,1,1,1,1}));// return 800.0, The bill was 1600.0 but as

    }
}

class Cashier{

    int n, discount, count = 1;
    int[] products, prices;
    static final HashMap<Integer, Integer> hashMap = new HashMap<>();

    public Cashier(int n, int discount, int[] products, int[] prices) {

        this.n=n;
        this.discount=discount;
        this.products=products;
        this.prices=prices;

        for(int i=0; i < products.length; i++){
            hashMap.put(products[i], prices[i]);
        }

    }

    public double getBill(int[] product, int[] amount) {

        double bill = 0.0;
        for(int i = 0; i < product.length; i++){
            bill += hashMap.get(product[i])*amount[i];
        }
        if(isTargetDiscount()){
            bill = applyDiscountAmount(bill);
        }
        this.count++;
        return bill;
    }

    private boolean isTargetDiscount(){
        return this.count%this.n == 0;
    }

    private double applyDiscountAmount(double bill){
        return bill*(this.discount*0.01);
    }

    public boolean canVisitAllRooms(List<List<Integer>> R) {
        boolean[] vis = new boolean[R.size()];
        vis[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int count = 1;
        while (stack.size() > 0)
            for (int k : R.get(stack.pop()))
                if (!vis[k]) {
                    stack.push(k);
                    vis[k] = true;
                    count++;
                }
        return R.size() == count;
    }
}
