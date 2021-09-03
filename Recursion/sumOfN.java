public class sumOfN{
    static int number(int n){

        if(n==0){
            return 0;
        }
        return n + number(n-1);
    }

    public static void main(String[] args) {
        System.out.print(number(5));
    }
}