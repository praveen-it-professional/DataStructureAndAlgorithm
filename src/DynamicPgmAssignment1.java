public class DynamicPgmAssignment1 {
    /*
Given two strings of length m and n , 
Find algorithm the length of their 
longest common subsequence in Time Complexity and 
Space complexity O(mn) Asked in : Linkedin, PayPal
    */
    private static int LCSPbm(String array1, String array2) {
        int m=array1.length();
        int n=array2.length();
        int matrix[][]=new int[m+1][n+1];
        String lcsChar="";
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                //case1- when character at str1, str2 matches, check diagonal element and increase value by 1
                if(array1.charAt(i-1)==array2.charAt(j-1)){
                    matrix[i][j]=matrix[i-1][j-1]+1;
                    lcsChar=lcsChar+array1.charAt(i-1);
                }else{
                    //case 2- when cht at str1, str2 doesn't matches, check top and left side value in 2d array, take biggest one.
                    matrix[i][j]= Integer.max(matrix[i][j-1], matrix[i-1][j]);
                }
                
            }
        }
        System.out.println("LCS String is "+lcsChar);
        return matrix[m][n];
    }

    public static void main(String[] args) {
        
        String array1="abcde";
        String array2="ace";

        System.out.println("Longest common sequest length is "+ LCSPbm(array1,array2));
    }    
}
