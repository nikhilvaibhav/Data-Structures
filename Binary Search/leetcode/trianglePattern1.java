public class trianglePattern1{
    public static void main(String[] args){
        pattern(4,0);
    }
    static int check = 4;
    static void pattern(int r, int c){
        if (r == 0){
            return;
        }
        if(c < check){
            System.out.print("*");
            pattern(r, c+1);
        }
        else{
            System.out.println();
            pattern(r-1, 0);
        }
    }
}