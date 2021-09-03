public class practice{

        
        static void fun2(int n)
        {
            int LIMIT = 1000;
            if (n <= 0) return;
            if (n > LIMIT) return;
        
            System.out.print(n + " ");
            fun2(2 * n);
            System.out.print(n + " ");
        }
    
    public static void main(String[] args) {
        fun2(500);
    }
}