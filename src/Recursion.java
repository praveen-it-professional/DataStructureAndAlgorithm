public class Recursion {

    public static void function(int val){
        if(val==5){
            return;
        }
        function(val+1);
        System.out.println(val);
    }
    public static void main(String[] args) {
        function(1);
    }
    
}
