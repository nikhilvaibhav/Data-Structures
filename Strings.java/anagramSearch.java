public class anagramSearch{

    //time complexity - O((m-n+1) * n)
    static boolean anagram(String txt, String pat){
        int m = txt.length();
        int n = pat.length();
        for(int i=0; i<=m-n;i++){
            int j;
            for(j=0; j<n; j++){
                char test = txt.charAt(j+i);
                if (pat.indexOf(test) == -1){
                    break;
                }
            }
            if(j==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "frog";
        System.out.print(anagram(txt, pat));
    }
}