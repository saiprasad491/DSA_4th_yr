class StackArray
{
int size = 5;
int data[];
int top = -1;
StackArray(){
data = new int[size];
}

boolean isEmpty()
{
 return top == -1;
}

int getSize()
{
 return top+1;
}

void print()
{
if(isEmpty())
{
System.out.println("Stack under flow");
}
else
{
for(int i=0;i<=top;i++)
   System.out.print(data[i]+" ");
System.out.println();
}
}

void push(int value)
{
if(getSize()==data.length)
{
System.out.println("Stack over flow");
}
else
{
top++;
data[top] = value;
}
}

int pop()
{
if(isEmpty())
{
System.out.println("Stack under flow can't pop element");
return -1;
}
else{
int ele = data[top];
top --;
return ele;
}
}

int peek()
{
if(isEmpty())
{
System.out.println("Stack is empty");
return -1;
}
else
{
return data[top];
}
}

boolean search(int value)
{
if(isEmpty())
{
return false;
}
else
{
for(int i=0;i<=top;i++)
{
if(data[i]==value)
  return true;
}
return false;
}

}
}

class StackDemo
{
public static void main(String ...args)
{
StackArray st = new StackArray();

st.print();	//Stack under flow
System.out.println("Size = "+st.getSize());	//Size = 0
System.out.println("Is Empty = "+st.isEmpty());	//Is Empty = true

st.push(111);
st.push(222);
st.push(333);
st.push(444);
st.push(555);

st.print();	//111 222 333 444 555
System.out.println("Size = "+st.getSize());	//Size = 5
System.out.println("Is Empty = "+st.isEmpty());	//Is Empty = false

st.push(666);	//Stack over flow
st.print();	//111 222 333 444 555
System.out.println("Size = "+st.getSize());	//Size = 5
System.out.println("Is Empty = "+st.isEmpty());	//Is Empty = false

System.out.println(st.pop());	//555
st.print();			//111 222 333 444

System.out.println(st.peek());	//444

System.out.println("Is 444 present "+st.search(444));	//Is 444 present true
System.out.println("Is 555 present "+st.search(555));	//Is 555 present false

}
}

