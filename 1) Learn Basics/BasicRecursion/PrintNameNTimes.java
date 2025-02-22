public class PrintNameNTimes
{
    public void printName(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("Sarvesh");
        printName(i+1,n);
    }
    public static void main(String args[])
    {
        PrintNameNTimes obj = new PrintNameNTimes();
        obj.printName(1,5);
    }
}