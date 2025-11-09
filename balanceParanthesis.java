public class balanceParanthesis {
    public static void main(String[] args) {
        //  String exp1 = "((()))()()"; 
         String exp2 = "())((())";
    
    if (isBalanced(exp2)) 
        System.out.println("Balanced");
    else
        System.out.println("Not Balanced");
        
    }
    public static boolean isBalanced(String s){
        boolean flag=true;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
                flag=false;
                break;
            }
        }
        if(count!=0){
            flag=false;
        }
        return flag;
    }
}
