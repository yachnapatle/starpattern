package star;
import java.util.Scanner;
public class butterfly2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in) ;
     int n=sc.nextInt();
     for(int i=1,p=1;i<=n;i++,p=p+2)
     {
        for(int j=1;j<=i;j++)
        {
        System.out.print(p +" ");
        }
     System.out.println();  
        
    }

    for(int i=1,p=5;i<=n;i++,p=p-2)
    {
    for(int j=i;j<n;j++)
    {
System.out.print(p +" ");
    }
    System.out.println();
    }  
}
}
