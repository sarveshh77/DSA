public class PrintAllDivisors 
{
    public void printDivisors(int n)
    {
        System.out.print("Divisors ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(+i+" ");
            }
        }
       
    }
    public static void main(String args[])
    {
        PrintAllDivisors pd = new PrintAllDivisors();
        pd.printDivisors(10);
    }
    
}
