public class isPower{
    public static void main(String[] args) {
        int num = 24;
        if(isPower(num)){
            System.out.println("two ka power hai");
        }
        else{
            System.out.println("two ka power nahi hai");
        }
    }

    static boolean isPower(int num){
        if (num == 0){
            return false;
        }
        if(num == 1 || num == 2){
            return true;
        }

        if (num % 2 != 0){
            return false;
        }
        return isPower(num/2);

    }
}