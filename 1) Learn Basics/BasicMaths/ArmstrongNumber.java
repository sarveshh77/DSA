import java.util.*;
public class ArmstrongNumber 
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int lastDigit,temp;
            int sum=0;

            System.out.println("Enter any number");
            int n = sc.nextInt();
            int len = String.valueOf(n).length();
    
            temp=n;

            while(n>0)
            {
                lastDigit=n%10;
                sum+=Math.pow(lastDigit,len);
                n=n/10;
            }
            if(sum==temp)
            {
                System.out.println("Armstrong Number");
            }
            else
            {
                System.out.println("Not an Armstrong Number");
            }
            sc.close();
            
        }
        
    }
