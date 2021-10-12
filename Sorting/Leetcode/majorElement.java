import java.util.Arrays;
public class majorElement{
    public static void main(String[] args) {
        int arr[] = {};
       // System.out.println(major(arr));
        System.out.println(slightOptimization(arr));
    }

    // brute-force solution --> O(n^2)
    //     static int major(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         int count=0;
    //         int check = arr[i];
    //         for(int j=0; j<arr.length; j++){
    //             if(check == arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count > arr.length/2){
    //             return check; 
    //         }
    //     }
    //     return -1; 
    // }

    // slight optimation --> O(N.logN)
        static int slightOptimization(int arr[]){
            Arrays.sort(arr);
            if(arr.length == 1){
                return arr[0];
            }
            if(arr.length == 0){
                return -1;
            }
            int count = 1;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] == arr[i+1]){
                    count++;
                    if(count > arr.length/2){
                        return arr[i];
                    }
                }
                else{
                    count = 1;
                }
            }
            return -1;
        }

}