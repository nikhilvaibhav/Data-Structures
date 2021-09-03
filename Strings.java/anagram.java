import java.util.Arrays;
public class anagram{
    static boolean ana(String str1, String str2){
        //not effiecientcode - O(n) solution.

        // if(str1.length() != str2.length()){
        //     return false;
        // }
        // for(int i=0; i<str2.length(); i++){
        //     char c = str2.charAt(i);
        //     if(str1.indexOf(c) == -1){
        //         return false;
        //     }
        // }
        // return true;    

        if(str1.length() != str2.length()){
            return false;
        }

        char ch[] = new char[128];
        for(int i=0 ;i<str1.length(); i++){
            ch[str1.charAt(i)]++;
            ch[str2.charAt(i)]--;
        }

        for(int i=0; i<ch.length; i++){
            if( ch[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "nikhil";
        String str2 = "himink";
        System.out.print(ana(str1, str2));

    }
}