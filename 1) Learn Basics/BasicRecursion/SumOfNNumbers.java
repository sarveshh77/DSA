public class SumOfNNumbers
{
    public void sum(int i , int sum)
    {
        if(i<0)
        {
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String args[])
    {
        SumOfNNumbers sn = new SumOfNNumbers();
        sn.sum(3, 0);
    }
}