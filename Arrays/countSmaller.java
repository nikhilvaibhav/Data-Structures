public class countSmaller{
    static int small(int arr[],int n, int element){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]<element){
                count++;
            }
        }
        if(count!=0){
            return count;
        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,1,2,5,3,11,12};
        int n = arr.length;
        int element = 14;
        System.out.print(small(arr,n,element));
    }
}