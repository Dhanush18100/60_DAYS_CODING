public class vowelsConsonent {
    public static void main(String[] args) {
      String str=  "Hello World";
      str=str.toLowerCase();
    count(str);
    }
    public static void count(String str){
        int vowels=0,cons=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>'a'&&ch<'z'){
                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    cons++;
            }
        }
        System.out.println("vowels"+vowels);
        System.out.println("Consonents"+cons);
    }
}
