import java.lang.*;
public class min{
    public static void main(String[] args) {
        int arr[] = {1,2,4,-5,6,5};
        System.out.println(mini(arr, 0));
        System.out.print(maxi(arr, 0));
    }

    static int mini(int arr[], int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        return Math.min(arr[i], mini(arr, i+1));

    }
    static int maxi(int arr[], int i){
        if(i == arr.length - 1){
            return arr[i];
        }

        return Math.max(arr[i], maxi(arr, i + 1));
    }
}