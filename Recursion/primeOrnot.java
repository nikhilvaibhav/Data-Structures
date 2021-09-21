public class primeOrnot{
    public static void main(String[] args) {
        int number = 110;
        if(isPrime(number, 2)){
            System.out.println("Prime number hai");
        }
        else{
            System.out.println("Prime number nahin hai");
        }
    }

    static boolean isPrime(int number, int i){
        if (number <= 1){
            return false;
        }

        if(i == number/2 - 1){
            return true;
        }

        if(number % i == 0){
            return false;
        }
        return isPrime(number, i+1);

    }
}