import java.util.ArrayList;
class Heap{
	ArrayList<Integer> arr = new ArrayList<>();
	public void add(int data){
		arr.add(data);
		int childIndex = arr.size()-1;
		int parentIndex = (childIndex-1)/2;

		while(arr.get(childIndex)<arr.get(parentIndex)){
			int temp = arr.get(parentIndex);
			arr.set(parentIndex,arr.get(childIndex));
			arr.set(childIndex,temp);
			childIndex = parentIndex;
			parentIndex = (childIndex-1)/2;
		}
	}
	public int peek(){
		return arr.get(0);
	}
	public boolean isEmpty(){
		return arr.size()==0;
	}
	public int remove(){
		int data = arr.get(0);
		//step-1 swap
		int temp = arr.get(0);
		arr.set(0,arr.get(arr.size()-1));
		arr.set(arr.size()-1,temp);
		//step-2 remove the last element
		arr.remove(arr.size()-1);
		//step-3 heapify
		heapify(0);
		return data;
	}
	public void heapify(int index){
		int left = 2*index + 1;
		int right = 2*index + 2;
		int mi = index;
		if(left < arr.size() && arr.get(mi) > arr.get(left))
			mi = left;
		if(right < arr.size() && arr.get(mi) > arr.get(right))
			mi = right;
		if(mi!=index){
			int temp = arr.get(index);
			arr.set(index,arr.get(mi));
			arr.set(mi,temp);
			heapify(mi);
		}
	}
}
class Test4
{
	public static void main(String ...args)
	{
		Heap h = new Heap();
		h.add(4);
		h.add(1);
		h.add(7);
		h.add(0);
		h.add(5);
		h.add(1);
		System.out.print("Heap elements are ");	//Heap elements are  <= 0 <= 1 <= 1 <= 4 <= 5 <= 7
		while(!h.isEmpty()){
			System.out.print(" <= "+h.peek());
			h.remove();
		}
		System.out.println();
		System.out.println();
	}
}