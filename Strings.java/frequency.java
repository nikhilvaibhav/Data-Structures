public class frequency{
    static int[] fre(String str){
        int count[] = new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int res[] = fre(str);
        for(int i=0 ;i<res.length; i++){
            if(res[i] != 0){
                System.out.println((char)(i + 'a') + " -----> " + res[i]);
            }
        }
    }
}