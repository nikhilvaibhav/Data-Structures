public class checkSubstr{
        static boolean substr(String str1,  String str2){

            // time complexity - O(str1.length + str2.length)
            //space complexity - O(1)
            int j=0;
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) == str2.charAt(j)){
                    j++;
                }
            }
            if(j!=str2.length()){
                return false;
            }
            return true;
        }

        public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "aed";
        System.out.print(substr(str1, str2));
    }
}