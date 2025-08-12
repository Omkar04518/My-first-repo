import java.util.*;
public class StudentMarks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Enter the case ethier 1/0");
            choice  = sc.nextInt();

            if(choice==1){
                System.out.println("enter the Marks out of 100");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don’t matter but our effort does.");
                } else {
                    System.out.println("Invalid marks. Please enter a number between 0 and 100.");
                }
            } 

            }
            while(choice!=0);
            System.out.println("invalid case");
        
    }
}














