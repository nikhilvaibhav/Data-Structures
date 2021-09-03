public class Palindrome{
    static boolean isPalindrome(String name, int start, int end){
        if (start>=end){
            return true;
        }
        return name.charAt(start) == name.charAt(end)  && isPalindrome(name, start+1, end-1);
    }

    public static void main(String[] args) {
        String name = "saloolas";
        int start = 0;
        int end = name.length() - 1;
        if (isPalindrome(name, start, end)){
            System.out.print("is palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    }
}