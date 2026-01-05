class HashTable
{
int size;
int a[];
HashTable(int size)
{
this.size = size;
a = new int[this.size];
for(int i=0;i<this.size;i++)
a[i] = -1;
}

void print(){
System.out.println("Content of hash table : ");
for(int i=0;i<this.size;i++)
System.out.println(i+" ==> "+a[i]);
}

int compute(int value){
return value%this.size;
}

boolean add(int value){
int hcode = compute(value);
if(a[hcode] == -1){
a[hcode] = value;
return true;
}
return false;
}

boolean delete(int value){
int hcode = compute(value);
if(a[hcode] != -1 && a[hcode] == value){
a[hcode] = -1;
return true;
}
return false;
}

boolean search(int value){
int hcode = compute(value);
if(a[hcode] == value){
return true;
}
return false;
}

}
class TestHashTable
{
public static void main(String ...args)
{
HashTable h = new HashTable(10);
System.out.println(h.add(3));
System.out.println(h.add(13));
System.out.println(h.add(23));
System.out.println(h.add(14));
h.print();
System.out.println(h.search(13));
System.out.println(h.search(3));
System.out.println(h.delete(3));
h.print();
/*
true
false
false
true
Content of hash table :
0 ==> -1
1 ==> -1
2 ==> -1
3 ==> 3
4 ==> 14
5 ==> -1
6 ==> -1
7 ==> -1
8 ==> -1
9 ==> -1
false
true
true
Content of hash table :
0 ==> -1
1 ==> -1
2 ==> -1
3 ==> -1
4 ==> 14
5 ==> -1
6 ==> -1
7 ==> -1
8 ==> -1
9 ==> -1
*/

}
}