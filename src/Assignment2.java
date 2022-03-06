public class Assignment2 {
    
    /*
    We rotate an ascending order sorted array at some point 
    unknown to user. So for instance, 3 4 5 6 7 might become 
    5 6 7 3 4. Modify binary search algorithm to find an element 
    in the rotated array in O(log n) time and O(1) Space complexity
    */
    public int findNumber(int[] arr, int start, int end, int key){

        if(start>end){return -1;}
        int mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }

        if(arr[start]<=arr[mid]){
            if(key<=arr[mid] && key>=arr[start]){
                return findNumber(arr, start, mid-1, key);
            }else{
                return findNumber(arr, mid+1, end, key);
            }
        }else{
            if(key>=arr[mid]&&key<=arr[end]){
                return findNumber(arr, mid+1, end, key);
            }else{
                return findNumber(arr, start, mid-1, key);
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[]={5,6,7,1,2,3,4};//rotated 3 times
        Assignment2 as2=new Assignment2();
        int index=as2.findNumber(arr, 0, arr.length-1, 4);
        System.out.println("Available at index number "+index);
    }
}
