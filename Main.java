import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rupees, dollar, pound ;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to currency converter \n Enter the currency code \n (1 = rupees to dollar , 2 = dollar to rupees , 3 = Pound to rupees3)");
        int code = sc.nextInt();
        if (code == 1) {
            System.out.println("enter the value in rupees to convert into dollar");
            rupees = sc.nextInt();
            dollar = rupees / 79.819;
            System.out.println("dollar :" + dollar);
        } else if (code == 2) {
            System.out.println("enter the value in dollar to convert into rupees");
            dollar = sc.nextInt();
            rupees = 79.819 * dollar;
            System.out.println("rupees :" + rupees);}
            else if (code ==3 ) {
                System.out.println("Enter the value in pound to convert into rupees ");
                pound = sc.nextInt();
                rupees = 93.96*pound;
                System.out.println("rupees : "+ rupees);
            }
        else {
            System.out.println("Enter a code between 1 to 3 only ");

        }
    }
}
