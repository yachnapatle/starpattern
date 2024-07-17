package star;
import java.util.Scanner;
public class number1 {

public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
    int n;
    n= sc.nextInt();
    // int number5;
    int i;
    for( i=n;i>=1;i--)
    {
        for(int j=n;j>=i;j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
    
}
