import java.util.*;

public class greaterless
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x == y){
            System.out.println("Equal");
        }
        else if(x > y){
            System.out.println("X is Greater");
        }
        else{
            System.out.println("X is Lesser");
        }
        
    }
}