public class problem1{
    public static void main(String[] args) {
        int [][] grid = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        int count = 0;
        for(int row[] : grid){
            count += search(row);
        }
        System.out.println(count);
    }

    static int search(int row[]){
        int count = 0;
        int start = 0;
        int end = row.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(row[mid] >=0 ){
                start = mid + 1;
            }

            else{
                count += end - mid + 1;
                end = mid - 1;
            }
        }
        return count;
    }
}