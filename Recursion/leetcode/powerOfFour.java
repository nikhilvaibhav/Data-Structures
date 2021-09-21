public class powerOfFour{
    public static void main(String[] args) {
        int num = 64;
        if(isPower(num)){
            System.out.println("four ka power hai");
        }
        else{
            System.out.println("four ka power nahi hai");
        }
    }

    static boolean isPower(int num) {
        if (num == 0) return false;
        if(num == 1 || num == 4) return true;
        if(num% 4 != 0) return false;
        return isPower(num/4); 
    }
}