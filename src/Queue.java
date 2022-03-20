public class Queue {

    int[] que;
    int maxSize;
    int front;
    int rear;
    Queue(int size){
        this.maxSize=size;
        this.que=new int[maxSize];
        this.front=-1;
        this.rear=-1;
    }

    public static void main(String[] args) {
        Queue queue=new Queue(2);
        queue.enQueue(5);//insert
        queue.enQueue(6);
        //queue.enQueue(2);
        //queue.enQueue(8);
        queue.printQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.printQueue();
    }

    private void deQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
          return;
        }else{
            int elem= que[front];
            if(front>=rear){
                front=-1;
                rear=-1;
            }else{
            System.out.println("Value removed from queue "+elem);
            front++;
            }
        }
    }

    private boolean isEmpty() {
        return ((front==-1));
    }

    private void printQueue() {
        if(isEmpty()){
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(que[i]+"-->");
        }
        System.out.println();
    }

    private void enQueue(int i) {
      if(isFull()){
          System.out.println("Queue is Full!!!");
          return;
      }
      else{
          if(front==-1){
              front=0;
          }
          rear++;
          que[rear]=i;
      }
    }

    private boolean isFull() {
        return (front==0 && rear==maxSize-1);
    }
    
}
