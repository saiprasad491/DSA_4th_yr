
import java.util.Arrays;
class Test5
{	
	static void heapSortAsc(int[] a){
		//step-1 To build max heap
		int n = a.length;
		for(int i=n/2;i>=0;i--){
			heapify(a,i,n);
		}
		//step-2 push the largest element to last
		for(int i=n-1;i>0;i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a,0,i);
		}
	}
	static void heapify(int[] a,int i, int n){
		int left = 2*i+1;
		int right = 2*i+2;
		int mi = i;
		if(left<n && a[left]>a[n])
			mi = left;
		if(right<n && a[right]>a[n])
			mi = right;
		if(mi!=i){
			int temp = a[i];
			a[i] = a[mi];
			a[mi] = temp;
			heapify(a,0,i);
		}
	}
	
	public static void main(String ...args){
		int[] a = {4,1,7,0,5,1};
		System.out.println(Arrays.toString(a));	//[4, 1, 7, 0, 5, 1]
		heapSortAsc(a);
		System.out.println(Arrays.toString(a));	//[4, 1, 7, 0, 5, 1]		
	}
}