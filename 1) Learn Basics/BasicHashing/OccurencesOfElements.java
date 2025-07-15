import java.util.*;
public class OccurencesOfElements
{
    public static void main(String args[])
    {
        int hash[] = new int[10000];
        int n;
        int count;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //precompute

        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }
        System.out.println("Enter element you wanna count occurences for");
        count=sc.nextInt();

        System.out.println("Occurences of " +count+ " are " +hash[count]);
    }
}



/*Note : IF you declared hash array globally then you can define size as 10e7 
and in main u can define size as 10e6/* */