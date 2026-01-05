import java.util.Stack;
class SortedInsert
{
static void sortedInsertion(Stack<Integer> ss,int value)
{
if(ss.empty() || value>ss.peek())
ss.push(value);
else{
int temp = ss.pop();
sortedInsertion(ss,value);
ss.push(temp);
}
}
public static void main(String ...args)
{
Stack<Integer> st = new Stack<>();
st.push(111);
st.push(333);
st.push(555);
System.out.println(st);	//[111, 333, 555]
sortedInsertion(st,222);
sortedInsertion(st,444);
sortedInsertion(st,-111);
System.out.println(st);	//[-111, 111, 222, 333, 444, 555]
}
}