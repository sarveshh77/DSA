public class GCD 
{
    public int gcd(int a , int b)
    {
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String args[])
    {
        GCD g = new GCD();
        System.out.println("GCD or HCF is :" +g.gcd(30, 40));
    }
    
}
