public class freqChar {
    public static void main(String[] args) {
        String s="hello";
        int[]freq=new int[126];
        for(char  c : s.toCharArray()){
            freq[c]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i+":"+freq[i]);
            }
        }
        

    }
}
