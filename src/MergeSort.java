import java.util.Arrays;

public class MergeSort {

    // Sort array arr [low..high] using auxiliary array aux
	public static void mergeSort(int[] arr, int[] aux, int low, int high)
	{
		 //Practise Yourself : Write your code Here
		if(high==low){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid+1, high);
        merge(arr,aux,low,mid,high);
	}

	// Function to check if arr is sorted in ascending order or not
	public static boolean isSorted(int[] arr)
	{
		int prev = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (prev > arr[i]) {
				System.out.println("Complete your code");
				return false;
			}
			prev = arr[i];
		}

		return true;
	}

    public static void merge(int[] array, int[] res,int low, int mid, int high){

        int k=low, i=low, j=mid+1;

        while(i<=mid && j<=high){
            if(array[i]<=array[j]){
                res[k++]=array[i++];
            }else{
                res[k++]=array[j++];
            }
        }

        while(i<=mid){
            res[k++]=array[i++];
        }

        while(j<=mid){
            res[k++]=array[j++];
        }

        for(i=low;i<=high;i++){
            array[i]=res[i];
        }
    }
	
	public static void main(String[] args)
	{
		int[] arr = {10,40,12,3,2,9,50,100};
		int[] aux = Arrays.copyOf(arr, arr.length);

		// sort array 'arr' using auxiliary array 'aux'
		mergeSort(arr, aux, 0, arr.length - 1);

		if (isSorted(arr)) {
			System.out.println(Arrays.toString(arr));
		}
	}
    
}
