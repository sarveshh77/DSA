import java.util.Scanner;

public class BubbleSort 
{
    public void bubbleSort(int n , int arr[])
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
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
        BubbleSort obj = new BubbleSort();

        obj.bubbleSort(n,arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

