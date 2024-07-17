package star;
import java.util.Scanner;
public class reversetriangle
 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1,p=n;i<=n;i++,p--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            
            for(int j=1;j<=(n-i)+1;j++)
            {              System.out.print(p+" ");
            }  

            for(int j=1;j<(n-i)+1;j++)
            {
                System.out.print(p+" ");
            }
             System.out.println();
        }
        
         for(int i=2,p=2;i<=n;i++,p++)
         {
            
            for(int j=1;j<(n-i)+1;j++)
            {
                System.out.print("  ");
            }
             
            for(int j=1;j<i;j++)
            {
                System.out.print(p+" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }



        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=(n-i);j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }
        
    }
    
}
