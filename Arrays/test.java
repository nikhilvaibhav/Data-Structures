class test
{
    static int[] insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        for(int i=index+1; i<=sizeOfArray; i++){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        
        return arr;
    }
        
    

    public static void main(String [] args){
        int arr[] = new int[5];
        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4;
        int n = arr.length;
        int index = 2;
        int element = 45;
        insertAtIndex(arr, n, index, element);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}