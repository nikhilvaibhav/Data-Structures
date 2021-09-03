public class nTo1{
    static void number(int n){
        
       if(n==1){
           System.out.print(1);
       }
       else{
           System.out.print(n + " ");
           number(n-1);
       }
    }
    public static void main(String[] args) {
        number(5);
    }
}