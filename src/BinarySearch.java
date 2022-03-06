public class BinarySearch {

    // Find out if a key x exists in the sorted array
    // array[left..right] or not using binary search algorithm
    public static int binarySearch(int[] array, int left, int right, int key)
    {
       if(left>right){
           return -1;
       }
       
       int mid= (right+left)/2;
       if(key==array[mid]){
           return mid;
       }
       else if(key<array[mid]){
           return binarySearch(array,left,mid-1,key);
       }else{
           return binarySearch(array,mid+1,right,key);
       }
    }
    
 
    public static void main(String[] args)
    {
        int[] A = { 2, 5, 6, 8, 9, 10 };
        int key = 10;
 
        int left = 0;
        int right = A.length - 1;
 
        int index = binarySearch(A, left, right, key);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}