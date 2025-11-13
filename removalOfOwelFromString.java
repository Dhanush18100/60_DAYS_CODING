public class removalOfOwelFromString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(removeVowels(str));
    }
    public static String removeVowels(String str){
        return str.replaceAll("[AEIOUaeiou]", "");
    }
}
