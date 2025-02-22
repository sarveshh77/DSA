public class Print1ToN 
{
   public void printN(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        i++;
        printN(i, n);

    }
    public static void main(String[] args) 
    {
        Print1ToN obj = new Print1ToN();
        obj.printN(1, 8);
    }
    
}
