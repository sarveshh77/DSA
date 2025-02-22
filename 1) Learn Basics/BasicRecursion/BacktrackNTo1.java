public class BacktrackNTo1 
{
    public void back(int i, int n)
    {
        if(i > n) 
        {
            return;
        }
        back(i + 1, n); 
        System.out.println(i); 
    }
    public static void main(String args[])
    {
        BacktrackNTo1 bt = new BacktrackNTo1();
        bt.back(1, 5); 
    }
}