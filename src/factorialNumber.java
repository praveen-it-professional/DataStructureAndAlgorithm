public class factorialNumber {
    
    public static void main(String[] args) {
        
        int sum=fact(6);
        System.out.println("Factorial of 6 is "+sum);
    }

    private static int fact(int i) {
        if(i==1){
            return i;
        }
        return i*fact(i-1);
    }
}
