import java.util.*;
public class OccurencesOfElements
{
    public static void main(String args[])
    {
        int hash[]=new int[1000000];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array");
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Precompute 
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }

        System.out.println("Emter the number for checking occurencs");
        int num=sc.nextInt();

        //fetch
        System.out.println("Occurences of a number are " +hash[num]);
    }
}



/*Note : IF you declared hash array globally then you can define size as 10e7 
and in main u can define size as 10e6/* */