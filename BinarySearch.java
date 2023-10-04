import java.util.*;

class BinarySearch
{
	public static int print(int arr[],int key)
	{
		int start=0;
		int end=arr.length-1;
		

		while(start<=end)
		{
			int mid = (start+end)/2;

			if(arr[mid]==key)
			{
				return mid;
			}
			if(arr[mid]<key)
			{
				start = mid+1;
				
			}
			else
			{
				end = mid-1;
			}
		}
		return -1;
	  }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
	
	    System.out.println("Sorted array are:");
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    System.out.println();
		
		System.out.println("Enter key:");
		int key = sc.nextInt();

		System.out.println(key+" found at index:"+print(arr,key));


	}
}
