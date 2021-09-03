import java.util.Scanner;
public class secondLarge{
    static int large(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
    }

    for(int i=0; i<arr.length-2; i++){
        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
}
    return arr[arr.length-2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int arr[] = {4,5,3,7,6};
        System.out.print(large(arr));
    }
}