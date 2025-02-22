public class CountDigits
{
    int count=0;
    int lastDigit;
    public int countDigits(int n)
    {
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        CountDigits cd = new CountDigits();
        System.out.println(cd.countDigits(1234500));
    }
}