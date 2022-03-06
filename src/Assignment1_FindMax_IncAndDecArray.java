public class Assignment1_FindMax_IncAndDecArray {
    /*Problem statement 
    One array of integers is given as an input ,
    which is initially increasing and then decreasing or 
    it can be only increasing or decreasing , you need to 
    find the maximum value in the array in O(Log n) 
    Time complexity and O(1) Space Complexity
    */
    public int findMaxValue(int[] arr, int left, int right){

        if(left==right){
            return arr[left];
        }
        if(right==left+1){
            return arr[right]>=arr[left]?arr[right]:arr[left];
        }
        int mid = (right + left)/2;
        if(arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid]){
            return findMaxValue(arr, mid+1, right);
        }
        if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid]){
            return findMaxValue(arr, left, mid-1);
        }
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            return arr[mid];
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int arr[]={6,9,15,25,50,65,41,29,23,8};
        //int arr[]={100,90,50,25,10};
        Assignment1_FindMax_IncAndDecArray ex=new Assignment1_FindMax_IncAndDecArray();
        int maxVal= ex.findMaxValue(arr,0,arr.length-1);
        System.out.println("Max Value is "+maxVal);
    }
}
