package star;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print("  ");
            }
            for(int r=1;r<i;r++)
            {
                System.out.print("  ");
            }
            for(int w=1;w<=(n-i)+1;w++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
     
    }


