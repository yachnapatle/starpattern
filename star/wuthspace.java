package star;
import java.util.Scanner;
public class wuthspace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        for(int i=1,p=1;i<n;i++,p++)
        {
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("  ");
            }
            for(int o=1;o<=i;o++)
            {
                System.out.print(p+" ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(p+" ");
            }
            System.out.println();

        }
       System.out.print("  ");
for(int i=1,p=n;i<=n;i++,p--)
{
    for(int j=1;j<i;j++)
    {
        System.out.print("  ");
    }
    for(int k=1;k<=(n-i)+1;k++)
    {
        System.out.print(p+" ");
    }
    for(int l=1;l<=(n-i);l++)
    {
        System.out.print(p+" ");
    }
    System.out.println();
    System.out.print("  ");

}
        
        
    }
    
}
