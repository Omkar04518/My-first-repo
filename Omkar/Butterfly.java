import java.util.*;
public class Butterfly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //upper part
        for(int i=1;i<=num;i++)
        {
            // 1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (num-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            

        }
        // lower part
        for(int i=num;i>=1;i--)
        {
            // 1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (num-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

    }
    
  }
}
