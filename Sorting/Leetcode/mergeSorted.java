import java.util.Arrays;
public class mergeSorted{
    public static void main(String[] args) {
        int nums1[] = new int[5];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        int m = 3;

        int nums2[] = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.print(Arrays.toString(nums1));
    }

    static void merge(int nums1[], int m, int nums2[], int n){
        int i=m,j=n,k=nums1.length;
        while(i>0  && j>0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            else if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--; 
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
}