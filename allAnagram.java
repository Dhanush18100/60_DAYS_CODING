import java.util.*;

public class allAnagram {
    public static void main(String[] args) {
        String []arr={"act", "god", "cat", "dog", "tac"};
        HashMap<String,ArrayList<String>>ans=new HashMap<>();
        for(String word:arr){
            char []ch=word.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);

            if(!ans.containsKey(sorted)){
                ans.put(sorted, new ArrayList<String>());
            }
             ans.get(sorted).add(word);
        }
         for (ArrayList<String> group : ans.values()) {
            System.out.println(group);
        }
    }
}
