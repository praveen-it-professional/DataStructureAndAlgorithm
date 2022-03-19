import java.util.Arrays;

public class Assignment3 {

    public static void sortZerOneTwo(int[] arr,int low,int high){

        if(low>high){ System.out.println("Invalid Input!!!"); return;}
        int hkey=0;
        while(hkey<=high){
            if(arr[hkey]==0){
                //swap with left most element, inc hkey and low key 
                swapNumber(arr,hkey,low);
                hkey++;
                low++;
            }
            else if(arr[hkey]==2){
                //swap with right most element, dec high
                swapNumber(arr,hkey,high);
                high--;
            }
            else{
                //increse hkey
                hkey++;
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
        sortZerOneTwo(arr,0,arr.length-1);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
