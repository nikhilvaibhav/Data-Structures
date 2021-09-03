public class PatternSearch{
    // very Naive solution..
    static int search(String str, String pat){
        int m = str.length();
        int n = pat.length();
        for (int i=0; i<=m-n; i++){
            int j;
            for (j=0; j<n; j++){
                if(str.charAt(j + i) != pat.charAt(j)){
                    break;
                }
            }
            if (j == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "ABCABC";
        String pat = "ABC";

        System.out.print(search(str, pat));
    }
}