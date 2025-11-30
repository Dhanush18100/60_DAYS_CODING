import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        int totalPrice=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought: ");
        int pizza=sc.nextInt();
        System.out.print("Enter the no of puffs bought: ");
        int puffs=sc.nextInt();
        System.out.print("Enter the no of cool drinks bought: ");
        int coldDrink=sc.nextInt();
        int pizzaa=pizza*100;
        int puffss=puffs*20;
        int cold=coldDrink*10;
        System.out.println("Bill Details");
        System.out.println("Number of pizza: "+pizza);
        System.out.println("Number of puffs: "+puffs);
        System.out.println("Number of coldDrink: "+coldDrink);
        totalPrice+=pizzaa+puffss+cold;
        System.out.print("Total Price = "+totalPrice);

    }
}
