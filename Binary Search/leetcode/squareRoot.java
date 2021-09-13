public class squareRoot{
    public static void main(String[] args) {
        int number = 8;
        System.out.print(root(number));
    }

    static int root(int number){
        int start = 1;
        int end = number;

        if (number == 0){
            return 0;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid > number/mid){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}