import java.io.*;
class reverse
{
	public static void main (String args[])
	{
	int arr[] =new int []{5,7,12,4,6};
	int n = arr.length;
	int res[] =new int [n];
	int j=0;
	for(int i=n-1;i>=0;i--)
	{
		
		res[j]=arr[i];
		j++;
		
	}
	for(int k=0;k<n;k++)
	{
	System.out.print(res[k]+" ");
    }
} 
}