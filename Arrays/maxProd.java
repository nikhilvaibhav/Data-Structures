public class maxProd{
    public static void main(String[] args){
        int arr[] = {1,5,4,5};
        System.out.println(optimised(arr));
    }
    // brute force algorithm --> Two loops --> One outer --> one inner loop - O(n)
    static int product(int[] arr){
        int max = 0;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = (arr[i]-1) * (arr[j]-1);
                if(temp > max){
                    max=temp;
                }
            }
        }
        return max;
    }

    static int optimised(int arr[]){
        int max1 = 0;
        int max2 = 0;

        for(Integer num : arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if(num > max2){
                max2 = num;
            }
        }
        return (max1-1) * (max2-1);
    }
}