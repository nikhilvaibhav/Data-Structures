public class removeDuplicate{
    static void duplicate(int arr[]){

        //space complexity - O(n)
        //time complexity - O(n)
        int brr[] = new int [arr.length];
        int k=0;
        brr[k] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] != brr[k]){
                brr[k+1]=arr[i];
                k++;
            }
        }
        for(int i=0; i<brr.length;i++){
            if(brr[i]!=0){
                System.out.print(brr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        duplicate(arr);
        
    }
}