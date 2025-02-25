public class FunctionalRecursion 
{
    public int sum (int num)
    {
        if(num==0)
        {
            return 0;
        }
        return num+sum(num-1);
    }
    public static void main(String args[])
    {
        FunctionalRecursion fr = new FunctionalRecursion();
        System.out.println(fr.sum(3));
    }
}

//This is done by an functionalRecusrion and the same problem is also done by parameterised recusrion  