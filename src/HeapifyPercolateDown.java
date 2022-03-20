public class HeapifyPercolateDown {

    private static void printHeap(int[] array, int n) {
        for(int i=0;i<n-1;i++){
            System.out.print(array[i] + " "); 
        }
        System.out.println(); 
    }

    public static void heapify(int[] arr, int n, int i){

        //step3- compare with it' repective child nodes 
        //till it reaches down <n
        int smaller=i;
        int l= 2*i+1;
        int r=2*i+2;

        if(l<n && arr[l]<arr[smaller]){
            smaller=l;
        }
        if(r<n && arr[r]<arr[smaller]){
            smaller=r;
        }
        //swap once compared
        if(smaller!=i){
            int swap=arr[i];
            arr[i]=arr[smaller];
            arr[smaller]=swap;
            heapify(arr, n, smaller);
        }
    }

    private static void buildHeap(int[] arr, int length) {
        //step1- swap the last node with root node and remove the swapped root node.
        int swap=arr[0];
        arr[0]=arr[length-1];
        arr[length-1]=swap;
        //- Percolate down till index >n
        //step2- Assume smaller at root node and compare with it' repective child nodes 
        //till it reaches down <n
        for(int i=0;i<length-1;i++){
            heapify(arr,length-1,i);
        }
    }

    public static void main(String[] args) {
        
        int arr[]= {3,5,9,6,8,20,10,12,18,11};
        buildHeap(arr,arr.length);
        printHeap(arr,arr.length);
    }
}
