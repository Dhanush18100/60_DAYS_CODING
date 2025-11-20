import java.util.Stack;

public class balanceP {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character>stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{' || c=='(' || c=='['){
                stk.push(c);
            }else{
                if (stk.isEmpty()) {
                    System.out.println("False");
                }
                char top=stk.pop();
                if((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '['))
                    System.out.println("False");

            }
        }
        System.out.println(stk.isEmpty() ? "Yes" : "No");
    }
}
