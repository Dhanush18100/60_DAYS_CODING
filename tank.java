import java.util.Scanner;

public class tank {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        float liter=sc.nextFloat();
        if(liter<=0){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Enter the distance covered");
        float distance=sc.nextFloat();
         if (distance <= 0) {
            System.out.printf("%.0f is an Invalid Input", distance);
            return;
        }
        float litersPer100km=(liter/distance)*100;
        float miles = distance * 0.6214f;
        float gallons = liter * 0.2642f;

        float milesPerGallon = miles / gallons;

         System.out.println("Liters/100KM");
        System.out.printf("%.2f\n", litersPer100km);

        System.out.println("Miles/gallons");
        System.out.printf("%.2f\n", milesPerGallon);
    }

}
