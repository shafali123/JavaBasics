import java.util.*;

public class evenno{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt() ;
        int x = 0;
       
        for( int i=0;i<n;i++)
        {
             if(x%2==0)
        {
            System.out.println("Number is Even: "+i); 
        }
        x++;
        }
    }
}
