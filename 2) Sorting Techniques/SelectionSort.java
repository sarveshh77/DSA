import java.lang.reflect.Array;
import java.util.*;
public class SelectionSort
{

    public void selectionSort(int n , int arr[])
    {
        
        for(int i=0;i<=n-2;i++)
        {
            int mini=i;

            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]= temp;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter length of array");
        n=sc.nextInt();

        System.out.println("Enter Array elements");
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        SelectionSort obj = new SelectionSort();

        obj.selectionSort(n,arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}