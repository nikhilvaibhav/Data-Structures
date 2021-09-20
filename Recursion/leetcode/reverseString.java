import java.util.*;
public class reverseString{
    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o', 'h'};
        int n = s.length;
        reverse(s, 0, n);
        System.out.print(Arrays.toString(s));
    }

    static void reverse(char[] s, int i, int n){
        if(i == n || i > n){
            return;
        }

        char temp = s[i];
        s[i] = s[n - 1];
        s[n-1] = temp;

        reverse(s, i+1, n-1);
    }
}