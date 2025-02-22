public class BasicRecursionExample
{
    public void fun()
    {
        System.out.println("1");
        fun();
    }
    public static void main(String[] args) 
    {
        BasicRecursionExample obj = new BasicRecursionExample();
        obj.fun();
    }
}

//This is how stack-overflow happens by recursion