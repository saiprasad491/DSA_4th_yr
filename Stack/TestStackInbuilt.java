import java.util.Stack;
class TestStackInbuilt
{
public static void main(String ...args)
{
Stack st = new Stack();
System.out.println(st);	//[]
System.out.println(st.isEmpty()); //true
System.out.println(st.empty()); //true

st.push(111);
st.push(222);
st.push(333);
System.out.println(st);	//[111, 222, 333]

System.out.println(st.peek());	//333
System.out.println(st);		//[111, 222, 333]
System.out.println(st.pop());	//333
System.out.println(st);		//[111, 222]
System.out.println(st.peek());	//222

System.out.println(st.search(111));	//2
System.out.println(st.search(222));	//1
System.out.println(st.search(333));	//-1

}
}