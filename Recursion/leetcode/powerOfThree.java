public class powerOfThree{
    public static void main(String[] args) {
        int num = 2;
        if(isPow(num)){
            System.out.println("three ka power hai");
        }
        else{
            System.out.println("three ka power nahi hai");
        }
    }

    static boolean isPow(int num){
        if(num == 0){
            return false;
        }
        if(num == 1 || num == 3){
            return true;
        }

        if(num % 3 == 1){
            return false;
        }
        return isPow(num/3);
    }
}