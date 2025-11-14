public class hcf {
    public static void main(String[] args) {
        int a=70,b=15;
        int hcf=0;
        int smallest =(a<b)?a:b;
        for(int i=1;i<=smallest;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}
