public class twoDsearch{
    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 19;
        int count = 0;
        boolean ans=false;
        // ans = false || false; ans = false;
        // ans = false || false = false
        // ans = false || true = truw; 
        // ans = false || false = false
        for(int row[] : arr){
            ans = ans || search(row, target);
            if(ans){break;}
        }
        System.out.println(ans);
    }

    static boolean search(int row[], int target) {
        int start = 0;
        int end = row.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(row[mid] == target){
                return true;
            }
            if(row[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}