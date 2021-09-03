public class oneTon{
    static void number(int n){
        if(n==0){
            return;
        }
        else{
            number(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        number(5);
    }
}