public class BaseCondition 
{
    int count=0;
    public void baseCondition()
    {
        if(count==4)
        {
            return;
        }
        System.out.println(count);
        count++;
        baseCondition();
    }
    public static void main(String[] args)
    {
        BaseCondition bc = new BaseCondition();
        bc.baseCondition();
    }
}
