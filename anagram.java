import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
     System.out.println(isAnagram("listen", "silent")); 
        System.out.println(isAnagram("hello", "world"));  
    }
    public static boolean isAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        if(ch1.length!=ch2.length){
            return false;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       
        return Arrays.equals(ch1, ch2);
    }
}
