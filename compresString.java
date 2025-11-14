public class compresString {
    public static void main(String[] args) {
        String inputStr = "a3b5c2a2";
        System.out.println(compressStr(inputStr));
    }
    public static String compressStr(String s){
        StringBuilder cmpressStr=new StringBuilder();
        for(int i=0;i<s.length();i+=2){
            char c=s.charAt(i);
            int count=Character.getNumericValue(s.charAt(i+1));
            while (count>0) {
                cmpressStr.append(c);
                count--;
            }

        }
        return cmpressStr.toString();
    }
}
