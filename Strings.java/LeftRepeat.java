public class LeftRepeat{
    static int repeat(String str){
        // highly inefficient solution
        // O(n^2)  -> Time complexity.

        // for(int i=0; i<ch.length(); i++){
        //     for(int j=i+1; j<ch.length(); j++){
        //         if(ch.charAt(i) == ch.charAt(j)){
        //             return i;
        //         }
        //     }
        // }
        // return -1;


        // Better solution 
        // time complexity -> O(n) and space complexity - O(n)
        // int count[] = new int[128];
        // for(int i=0; i<ch.length(); i++){
        //     count[ch.charAt(i)]++;
        // }
        // for(int i=0; i<ch.length(); i++){
        //     if(count[ch.charAt(i)] > 1){
        //         return i;
        //     }
        // }
        // return -1;


        //Efficient solution. 

        for(int i=1; i<str1.length(); i++){
            char ch = str.charAt(i-1);

            if(ch == str.charAt(i))
        }

    }

    public static void main(String[] args) {
        String str = "abcdb";
        System.out.print(repeat(str));
    }
}