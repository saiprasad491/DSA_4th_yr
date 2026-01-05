class StackList
{
Node head = null;
int size = 0;

class Node{
int value;
Node next;
Node(int value,Node next){
this.value = value;
this.next = next;
}
}

int getSize(){
return this.size;
}

boolean isEmpty(){
return size == 0;
}

void display(){
if(isEmpty()){
System.out.println("Stack is empty");
return;
}
Node temp = head;
while(temp != null){
System.out.print(temp.value+" ");
temp = temp.next;
}
System.out.println();
}

void push(int value){
head = new Node(value,head);
size++;
}

int peek(){
if(isEmpty()){
System.out.println("Stack under flow");
return -1;
}
return head.value;
}

int pop(){
if(isEmpty()){
System.out.println("Stack under flow");
return -1;
}
int temp = head.value;
head = head.next;
return temp;
}

public String toString(){
String s = "";
Node temp = head;
while(temp!=null){
s += temp.value + " ";
temp = temp.next;
}
String str[] = s.split(" ");
String res = "[ ";
for(int i=str.length-1;i>=0;i--)
{
res += str[i]+", ";
}
res += "]";
return res;
}

}

class TestStackList
{
public static void main(String ...args)
{
StackList s = new StackList();
s.display();	//Stack is empty
System.out.println(s.isEmpty());	//true
System.out.println("Size = "+s.getSize());	//Size = 0
s.push(111);
s.push(222);
s.push(333);
s.display();	//333 222 111
System.out.println(s.peek());	//333
System.out.println(s.pop());	//333
s.display();	//222 111

System.out.println("Stack is "+s);	//Stack is [ 111, 222, ]

}
}