public class lcmOfTwoNumber {
    public static void main(String[] args) {
        int a = 24, b = 36;
        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
    public static int findLCM(int num1,int num2){
        int lcm=Math.max(num1, num2);
        while(true){
            if(lcm%num1==0 && lcm%num2==0){
                return lcm;
            }
            lcm+=Math.max(num1, num2);
        }
    }
}
