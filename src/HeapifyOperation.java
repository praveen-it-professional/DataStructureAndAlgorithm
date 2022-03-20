public class HeapifyOperation {
    //find the parent index of last element, assume parent index has largest value, 
    //compare it's respective childrens and swap with largest one, again heapify till
    //it reaches the rootnode, continue this process with all the nodes.

    public static void heapify(int arr[],int n,int j){

        int largest=j;
        int l= 2*j+1;
        int r=2*j+2;

        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=j){
            //swap it
            int swap=arr[j];
            arr[j]=arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }

    public static void buildHeap(int arr[], int n){
        int parentIndex= (n-1)/2;//5,4,3,2,1,0
        for(int i=parentIndex;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    public static void printHeap(int array[],int n){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " "); 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        
        int array[] = {3,5,9,6,8,20,10,12,19,18,2};
        int n=array.length;
        buildHeap(array,n);
        printHeap(array,n);
    }
    
}
