import java.util.PriorityQueue;
import java.util.Collections;
class Test1
{
public static void main(String ...args)
{
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
pq.add(4);
pq.add(1);
pq.add(7);
pq.add(0);
pq.add(5);
pq.add(1);
System.out.print("Priority Queue elements are ");
while(!pq.isEmpty()){
System.out.print(" <= "+pq.remove());	//Priority Queue elements are  <= 7 <= 5 <= 4 <= 1 <= 1 <= 0
}
System.out.println();
}
}