public class detectCapital{
    public static void main(String[] args) {
        String str = "Kill";
        System.out.print(check(str));

    }

    static boolean check(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                count++;
            }
        }
        if(count == 0 || count == str.length() || count == 1 && str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
            return true;
        }
        return false;
    }
}