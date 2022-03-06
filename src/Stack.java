public class Stack {
    
        private int maxSize;
        private long [] stack;
        private int topPtr;
        
        public Stack(int s) {
            maxSize=s;
            stack=new long[maxSize];
            topPtr=-1;
        }
        
        public void push(long ele) {
            if(isFull()){
                System.out.println("Stack is Full!!!");
            }else{
                System.out.println("inserting elem: "+ele);
                stack[++topPtr]=ele;
            }
        }
        
        public Boolean isFull() {
            if(topPtr==maxSize-1){
                return true;
            }else{
                return false;
            }
        }
        
        public Boolean isEmpty() {
            if(topPtr==-1) return true;
            else return false;
        }
        
        public long pop() {
            if(isEmpty()){
                System.out.println("Stack is Empty!!!!");
                System.exit(1);
            }
            return stack[topPtr--];
        }
        
        public void printStack() {
            System.out.print("Stacks are->");
            for(int i=0;i<=topPtr;i++){
                System.out.print(stack[i]+":");
            }
        }
        
        public static void main(String [] args){
            Stack st=new Stack(3);
            st.push(14);
            st.push(26);
            st.printStack();
            
            st.pop();
            st.printStack();
            
            st.push(45);
            st.push(67);
            st.printStack();
            
            st.push(78);
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            
        }     
}