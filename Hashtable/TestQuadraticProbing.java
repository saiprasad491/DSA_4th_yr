
class HashTable
{
int size;
int a[];
HashTable(int size){
this.size = size;
a = new int[size];
for(int i=0;i<this.size;i++)
a[i] = -1;
}

void print(){
System.out.println("Content of hash table : ");
for(int i=0;i<this.size;i++)
System.out.println(i+ " ==> "+ a[i]);
}

int compute(int value){
return value % size;
}

int compute1(int index){
return index*index;
}

boolean add(int value){
int hcode = compute(value);
for(int i=0;i<this.size;i++){
if(a[hcode]==-1){
a[hcode] = value;
return true;
}
hcode = hcode + compute1(i);
hcode = hcode % size;
}
return false;
}

boolean delete(int value){
int hcode = compute(value);
for(int i=0;i<size;i++){
if(a[hcode] != -1 && a[hcode]==value){
a[hcode] = -1;
return true;
}
hcode = hcode + compute1(i);
hcode = hcode % size;
}
return false;
}

boolean search(int value){
int hcode = compute(value);
for(int i=0;i<size;i++){
if(a[hcode] == value){
return true;
}
hcode = hcode + compute1(i);
hcode = hcode % size;
}
return false;
}
}

class TestQuadraticProbing
{
public static void main(String ...args)
{
HashTable h = new HashTable(10);
System.out.println(h.add(3));
System.out.println(h.add(13));
System.out.println(h.add(23));
System.out.println(h.add(33));
System.out.println(h.add(43));
System.out.println(h.add(53));
System.out.println(h.add(63));
System.out.println(h.add(73));
h.print();
System.out.println(h.search(3));
System.out.println(h.delete(3));
System.out.println(h.search(3));
h.print();
/*
true
true
true
true
false
false
false
false
Content of hash table :
0 ==> -1
1 ==> -1
2 ==> -1
3 ==> 3
4 ==> 13
5 ==> -1
6 ==> -1
7 ==> 33
8 ==> 23
9 ==> -1
true
true
false
Content of hash table :
0 ==> -1
1 ==> -1
2 ==> -1
3 ==> -1
4 ==> 13
5 ==> -1
6 ==> -1
7 ==> 33
8 ==> 23
9 ==> -1
*/
}
}