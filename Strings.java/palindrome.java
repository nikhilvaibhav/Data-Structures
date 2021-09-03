import java.util.Scanner;

public class palindrome{
    static boolean palin(String name){
        // here. complexity in O(n/2)
        // for(int i=0; i<name.length()/2; i++){
        //     if(name.charAt(i) != name.charAt(name.length() - 1- i)){
        //         return false;
        //     }

        // }
        // return true;
        StringBuilder rev = new StringBuilder(name);
        rev.reverse();
        return name.equals(rev.toString());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name you want to check for ");
        String name = sc.next();

        System.out.print(palin(name));
    }
}