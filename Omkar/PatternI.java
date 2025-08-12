import java.util.*;
public class PatternI { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1;i<=n;i++){
            // inner loop for space print

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
             // this inner loop to print star
            for(int j=1;j<=i;j++){
                 System.out.print("*");

        }
         System.out.println();
       
        }
        

       
    }
    
}
