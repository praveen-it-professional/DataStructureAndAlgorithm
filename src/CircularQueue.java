public class CircularQueue {

    public String[] queue;
    public int maxSize;
    public int rear, front;
    
    CircularQueue(int size){
        this.maxSize=size;
        this.queue=new String[size];
        this.rear=-1;
        this.front=-1;
    }

    public void enQueue(String elem){

        //(rear+1)%size
        if(isFull()){
            System.out.println("Queue is Full");
        }else{
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%maxSize;
            queue[rear]=elem;
        }
    }

    private boolean isFull() {
        return ((rear==maxSize-1 && front==0) || rear==front-1);
    }

    public String deQueue(){

        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
        }else{
            String elem= queue[front];
            front=(front+1)%maxSize;
            return elem;
        }
        return null;
    }

    private boolean isEmpty() {
        if(front==rear){
            front=-1; rear=-1;
            return true;
        }
        return false;
    }

    private void displayQueue(){

        if(rear>=front){
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+"->");
            }
        }else {
            for(int i=front;i<maxSize;i++){
                System.out.print(queue[i]+"->");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(queue[i]+"->");
            }
        }
        
        System.out.println("");
    }

    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(3);
        q.enQueue("Hello");//f=0,r=0
        q.enQueue("Praveen");//f=0,r=1
        q.displayQueue();
        q.deQueue();//f=1,r=1
        q.displayQueue();
        q.enQueue("H");//f=1,r=2
        q.displayQueue();
        q.enQueue("Pujar");//f=1,r=0
        q.displayQueue();
        q.enQueue("Hero");//Queue is Full
    }
}
