import java.util.*;
public class ReverseArray 
{
    public void fun(int i , int arr[],int n)
    {
        if(i>=n/2)
        {
            return;
        }
        swap(arr, i, n-i-1);
        fun(i+1,arr,n);
    }

    private void swap(int arr[], int i, int n) 
    {
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
    }
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter array size");
        n=sc.nextInt();
        int[] array  = new int[n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        ReverseArray ra = new ReverseArray();
        ra.fun(0,array,n);

        System.out.println("Reversed Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}
