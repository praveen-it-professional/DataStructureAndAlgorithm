public class SingleLinkedList {
        //2 pointers
    Node head=null;
    Node tail=null;

    class Node{

        public int data;
        public Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private void insert(int value) {
        Node newNode =new Node(value);

        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
        }else{
            this.tail.next=newNode;
            this.tail=newNode;
        }
    }

    private int search(int value){

        Node ptr=head;
        while(ptr!=null){
            if(ptr.data==value){
                return 1;
            }
            ptr=ptr.next;
        }
        return 0;
    }

    private int deleteNode(int value){

        Node ptr=head;
        Node prev=null;
        if(ptr==null){return 0;}
        /*if(ptr.data==value && ptr!=null){
            head=ptr.next;
            return 1;
        }*/
        while(ptr!=null){
            if(ptr.data==value){
                if(prev==null){
                    head=ptr.next;
                    return 1;
                }else{
                    prev.next=ptr.next;
                    return 1;
                }
            }else{
                prev=ptr;
                ptr=ptr.next;
            }
        }
        return 0;
    }

    private void dispaly(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(1);
        list.insert(6);
        list.dispaly();
        list.deleteNode(7);
        list.dispaly();
    }
}
