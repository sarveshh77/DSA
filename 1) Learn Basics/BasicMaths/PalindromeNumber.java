import java.util.*;
public class PalindromeNumber 
{
       public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int rev=0;
        int lastDigit;

        System.out.println("Enter any number");
        n=sc.nextInt();

        int temp=n;

        while(n>0)
        {
            lastDigit=n%10;
            rev=rev*10+lastDigit;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
          sc.close();
    }
}
