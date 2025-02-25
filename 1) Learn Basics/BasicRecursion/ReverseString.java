import java.util.Scanner;

public class ReverseString 
{
    boolean isPalindrome(int i , String str)
    {
        if(i>=str.length()/2)
        {
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length() - i - 1))
        {
            return false;
        }
        return isPalindrome(i+1, str);
    }

    public static void main(String[] args) 
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        str=sc.nextLine();

        ReverseString rs = new ReverseString();
        System.out.println(rs.isPalindrome(0, str));
    }
}
