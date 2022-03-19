public class doublyLinkedList {
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int val){
            this.data=val;
            this.next=null;
            this.prev=null;
        }
    }

    private void insert(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
        
    }

    private void display(){

        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    private void deleteNode(int value){
        Node ptr=head;
        if(ptr==null){
            System.out.println("DLinked List is empty!!!!");
            return;
        }
        while(ptr!=null){

            if(ptr.data==value){
                if(ptr.prev==null){
                    head=ptr.next;
                    ptr.prev=null;
                    break;
                }
                if(ptr.next!=null && ptr.prev!=null){
                    ptr.next.prev=ptr.prev;
                    ptr.prev.next=ptr.next;
                    break;
                }
                if(ptr.next==null && ptr.prev!=null){
                    tail=ptr.prev;
                    ptr.prev.next=null;
                    break;
                }
            }else{
                ptr=ptr.next;
            }
        }
    }

    private void search(int value){
        Node ptr=head;
        if(ptr==null){
            System.out.println("DLinked List is empty!!!!");
            return;
        }
        int count=1;
        while(ptr!=null){

            if(ptr.data==value){
                if(ptr.prev==null){
                    System.out.println("Element found in "+count+" Node!!!!");
                    break;
                }
                if(ptr.next!=null && ptr.prev!=null){
                    System.out.println("Element found "+count+" node");
                    break;
                }
                if(ptr.next==null && ptr.prev!=null){
                    System.out.println("Element found "+count+" node");
                    break;
                }
            }else{
                ptr=ptr.next;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        doublyLinkedList dList=new doublyLinkedList();
        dList.insert(3);
        dList.insert(4);
        dList.insert(5);
        dList.insert(7);
        dList.display();
        dList.deleteNode(5);
        dList.display();
        dList.search(7);
    }
}
