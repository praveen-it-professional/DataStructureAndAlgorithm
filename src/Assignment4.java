import java.util.Arrays;
/*
Given an array nums, write a function to move all 
0's to the end of it while maintaining the relative 
order of the non-zero elements in O(n) Time complexity 
and O(1) Space complexity with single traversal allowed
*/
public class Assignment4 {
    public static void moveZerToEnd(int[] arr, int len){
        int i=0,hk=0;
        while(hk<=len){
            if(arr[hk]==0){
                hk++;
            }
            else if(arr[hk]!=0){
                swapNumber(arr,i,hk);
                i++;
                hk++;
            }
        }

    }
    public static void swapNumber(int[] arr, int sortFrom, int sortWith){

        int temp=0;
        temp=arr[sortFrom];
        arr[sortFrom]=arr[sortWith];
        arr[sortWith]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,1,1,0,1,2,1,2,0,0,0,1};
        moveZerToEnd(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
