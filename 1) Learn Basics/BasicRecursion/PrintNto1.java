public class PrintNto1 
{
    public void fun(int n , int i)
    {
        if(n<i)
        {
            return;
        }
        System.out.println(n);
        n--;
        fun(n, i);
    }
    public static void main(String[] args) 
    {
        PrintNto1 obj = new PrintNto1();
        obj.fun(5,1);
    }
}
 