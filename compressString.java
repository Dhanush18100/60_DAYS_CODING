public class compressString {
    public static void main(String[] args) {
     String str = "aaabbccccd";
        System.out.println(compresString(str));
    }
    public static String compresString(String str){
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++){

            if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                result.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        return result.toString();
    }
}
