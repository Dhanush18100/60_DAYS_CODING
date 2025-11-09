import java.util.Stack;

public class balanceParanthesisUsingStacks {
    public static void main(String[] args) {
        String str = "()(())(";
        if (check(str) == 0) {
            System.out.println("Invalid");
        }
        else {
            System.out.println("Valid");
        }
        
    }
    public static int check(String s){
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stk.push(ch);
            }else if(ch==')'){
                if(stk.isEmpty()){
                    return 0;
                }else{
                    char p=stk.peek();
                    if(p=='('){
                        stk.pop();
                    }else{
                        return 0;
                    }
                }
            }
        }

        if(stk.isEmpty()){
            return 1;
        }else{
            return 0;
        }

    }
}
