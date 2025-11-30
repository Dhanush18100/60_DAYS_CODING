import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char q = (char) a;
        char r = (char) b;
        char s = (char) c;
        char t = (char) d;
        System.out.println();
        System.out.print(a);
        System.out.println("-" + q);
        System.out.print(b);
        System.out.println("-" + r);

        System.out.print(c);
        System.out.println("-" + s);

        System.out.print(d);
        System.out.println("-" + t);
    }
}
