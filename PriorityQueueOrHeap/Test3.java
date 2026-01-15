import java.util.PriorityQueue;
class Student implements Comparable<Student>
{
int rollNo;
String name;
Student(String name,int n){
this.rollNo = n;
this.name = name;
}
public int compareTo(Student s){
return this.rollNo - s.rollNo;
}
public String toString(){
return "[ "+this.rollNo+" , "+this.name+" ] ";
}
}

class Test3
{
public static void main(String ...args)
{
PriorityQueue<Student> pq = new PriorityQueue<>();
pq.add(new Student("Saiprasad Sahoo",417051));
pq.add(new Student("Abhilash Dehury",417001));
pq.add(new Student("Satyajit Sethi",417055));
pq.add(new Student("Abhipsa Pati",417002));
System.out.println("Students are ");
while(!pq.isEmpty()){
System.out.println(pq.peek());
pq.remove();
}
/*
Students are
[ 417001 , Abhilash Dehury ]
[ 417002 , Abhipsa Pati ]
[ 417051 , Saiprasad Sahoo ]
[ 417055 , Satyajit Sethi ]
*/

}
}