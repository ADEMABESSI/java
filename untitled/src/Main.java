import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Employée e1=new Employée();
        System.out.println(e1);
        Employée e2=new Employée();
        System.out.println(e2);
        // get the employee name and family name from the keyboard
        Scanner sc=new Scanner(System.in);
        //the first case the employee fields are public
        /*
        System.out.print("Enter the  employees name : ");
        e1.name=sc.nextLine();
        System.out.print("Enter the  employees familyName : ");
        e1.familyName=sc.nextLine();
        System.out.println("the employee is "+e1.familyName+" "+e1.name);

        */

         System.out.print("Enter the  employees name : ");
        e1.setName();=sc.nextLine();
        System.out.print("Enter the  employees familyName : ");
        e1.familyName=sc.nextLine();
        System.out.println("the employee is "+e1.familyName+" "+e1.name);

    }
}