public class reduceZero{
    public static void main(String[] args) {
        int num = 8;
        System.out.println(steps(num));
    }
    static int count = 0;
    static int steps(int num){
        if(num == 0){return count;}
        if(num % 2 == 0){
            count++;
            num = num / 2;
        }
        else{
            count++;
            num = num - 1;
        }

        return steps(num);
    }
}