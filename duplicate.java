import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
    //     HashSet<Character>ans=new HashSet<>();
    //     String s="aaaaabbbs";
    //     for(char c:s.toCharArray()){
    //         ans.add(c);
    //     }
    //     System.out.println(ans);
    // }
    String s="aaaabbbbbs";
    StringBuilder sb=new StringBuilder();
    boolean []seen=new boolean[256];
    for(char c:s.toCharArray()){
        if(!seen[c]){
            sb.append(c);
            seen[c]=true;
        }
    }
    System.out.println(sb);
    }
}
