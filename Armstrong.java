
import java.util.*;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();

        System.out.print(armstrongNumber(n));
    }

    public static String armstrongNumber(int n)
    {
        // code here

        int temp=n;
        int sum=0;

        while(n>0)
        {
            int rem=n%10;
            sum = sum+(rem*rem*rem);
            n=n/10;
        }

        if(temp==sum)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}
