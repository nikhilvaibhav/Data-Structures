public class firstAndLast{
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,5,5,6,7};
        int x = 2;
        
        for(int num : occurence(arr,x)){
            System.out.print(num + " ");
        }
        
    }
    // this solution is linear time complexity -- > O(n)
    static int[] occur(int arr[], int x){
        int res[] = {-1,-1};
        for(int i = 0 ;i < arr.length ;i++){
            if(arr[i] == x){
                if(res[0] == -1){
                    res[0] = i;
                }
                res[1] = i;
            }
        }
        return res;
    }

    //this solution is logN time complexity
    static int[] occurence(int arr[], int x){
        int start = 0;
        int end = arr.length - 1;
        int res[] = {-1,-1};

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == x){
                res[0] = mid;
            }
            if(arr[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }


        start = 0;
        end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == x){
                res[1] = mid;
            }
            if(arr[mid] <= x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return res;
    }
}