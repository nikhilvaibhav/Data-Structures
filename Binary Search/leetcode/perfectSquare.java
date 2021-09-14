public class perfectSquare{
    public static void main(String[] args) {
        int number = 5;
        System.out.print(check(number));
    }

    static boolean check(int number){
        if(number == 0){
            return true;
        }

        int start = 1;
        int end = number;

        while(start <= end){
            int mid = start + ( end - start)/2;
            if(mid * mid == number){
                return true;
            }
            else if(mid > number/mid){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;


    }
}