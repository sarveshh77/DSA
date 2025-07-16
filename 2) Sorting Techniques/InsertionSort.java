
public class InsertionSort 
{
    public void insertionSort(int n , int arr[])
    {
        for(int i=1;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println("Sorted array ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        int[] arr={13 , 12, 15 ,16 ,10};
        int n = arr.length;

        InsertionSort obj = new InsertionSort();
        obj.insertionSort(n, arr);
    }
}
