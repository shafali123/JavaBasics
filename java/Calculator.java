import java.util.*;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("press button for 1.addition, 2.subtraction, 3.multiplication, 4.division, 5.modulo");

        System.out.println(a);
        System.out.println(b);

        switch(n){
            case 1:
            System.out.println("Addition: "+(a+b));
            break;
            case 2:
            System.out.println("Subtraction: "+(a-b));
            break;
            case 3:
            System.out.println("Multiplication: "+(a*b));
            break;
            case 4:
            System.out.println("Division: "+(a/b));
            break;
            case 5:
            System.out.println("Modulo: "+(a%b));
            break;
            default:
            System.out.println("Invalid Number");
            break;
        }
    }
}