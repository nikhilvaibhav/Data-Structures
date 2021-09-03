public class greatThanTarget{
    public static void main(String[] args) {
        char arr[] = {'a', 'b'};
        char target = 'z';
        char res = search(arr, target);
        System.out.print(res);
    }

    static char search(char arr[], char target){
        int res = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                start = mid + 1;
            }
            else{
                if(arr[mid] < target){
                    
                    start= mid + 1;
                }
                else{
                    res = mid;
                    end = mid - 1;
                }
            }
        }
        return arr[res];
    }
}