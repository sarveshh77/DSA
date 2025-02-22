

public class Backtrack1ToN 
{
    public void backTrack(int i , int n)
    {
        if(i<1)
        {
            return;
        }
        backTrack(i-1, n);
        System.out.println(i);

    }
    public static void main(String args[])
    {
        Backtrack1ToN bt = new Backtrack1ToN();
        bt.backTrack(3, 3);
    }
    
}

