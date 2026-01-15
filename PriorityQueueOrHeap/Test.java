import java.util.PriorityQueue;
class Student implements Comparable<Student>
{
	int marks;
	String name;
	Student(int m,String n){
		this.marks = m;
		this.name = n;
	}
	public int compareTo(Student s){
		return this.marks-s.marks;
	}
	public String toString(){
		return "{ "+this.name+" , "+this.marks+" }";
	}
}
class Test
{
	public static void main(String ...args){
		PriorityQueue<Student> pq = new PriorityQueue<>();
		pq.add(new Student(10,"Abhilash"));
		pq.add(new Student(9,"Abhipsa"));
		pq.add(new Student(11,"Jitendra"));
		System.out.println("Elements are : ");
		while(!pq.isEmpty()){
			System.out.println(pq.peek());
			pq.remove();
		}
		/*
		Elements are :
		{ Abhipsa , 9 }
		{ Abhilash , 10 }
		{ Jitendra , 11 }
		*/
	}
}