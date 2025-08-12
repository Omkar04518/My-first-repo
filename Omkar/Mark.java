import java.util.*;
public class Mark{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int p = sc.nextInt();
        int c = sc.nextInt();
        int e = sc.nextInt();
        int operator = sc.nextInt();

        switch(operator)
        {
            case 1:System.out.println(" Marks" + m);
            break;

            case 2:System.out.println("Marks" + p);
            break;

            case 3:System.out.println("Marks" + c);
            break;

            case 4:System.out.println(" Marks" + e);
            break;

           default:System.out.println("Invalid conditon");

        }

    }

    
}
