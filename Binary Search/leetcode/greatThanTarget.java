public class greatThanTarget{
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c'};
        char target = 'c';
        char res = search(arr, target);
        System.out.print(res);
    }

    static char search(char arr[], char target){
        char ch = '#';
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        if(target >= arr[n-1]){
            return arr[0];
        }
        if(target < arr[0]){
            return arr[0];
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                start = mid + 1;
            }

            else if(arr[mid] > target){
                ch = arr[mid];
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return ch;
    }
}