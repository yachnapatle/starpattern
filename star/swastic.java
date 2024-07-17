package star;
import java.util.Scanner;
public class swastic {
public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if((i==j)||(i==j+2)||(i==j+3)||(i==j+4))
            {
                System.out.print("* ");
            }
            
        }
    }
    
}
    
}
