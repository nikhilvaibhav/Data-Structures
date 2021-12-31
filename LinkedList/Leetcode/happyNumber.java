public class happyNumber{
    public static void main(String[] args){
        int number = 19;
        System.out.print(happy(number));
    }

    static boolean happy(int number){
        int slow = number;
        int fast = number;

        do{
            slow = sq(slow);
            fast = sq(sq(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;

    }

    static int sq(int number){
        int res = 0;

        while(number != 0){
            int rem = number % 10;
            res = res + rem * rem;
            number /= 10;
        }
        return res;
    }
}