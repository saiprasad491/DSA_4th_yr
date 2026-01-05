class HashTable{
int size;
Node a[];

HashTable(int size){
this.size = size;
a = new Node[this.size];
for(int i=0;i<this.size;i++)
a[i] = null;
}

class Node{
int value;
Node next;
Node(int value, Node next){
this.value = data;
this.next = next;
}
}

int compute(int value){
return value % size;
}

void add(int value){
int hcode = compute(value);
a[hcode] = new Node(value, a[hcode]);
}

boolean delete(int value){
int hcode = compute(value);
Node nextNode, head = a[hcode];
if(head != null && head.value == value){
a[hcode] = head.next;
return true;
}
while(head != null){
nextNode = head.next;
if(nextNode != null && nextNode.value==value){
head.next
}
 
}

}

class TestSeparateChaining
{
public static void main(String ...args){

}
}