class StringBuilderDemo
{

public static void main(String[] args)
{
StringBuilder sb = new StringBuilder();
System.out.println(sb);			//
System.out.println(sb.length());	//0
System.out.println(sb.capacity());	//16

StringBuilder sb1 = new StringBuilder("abc");
System.out.println(sb1);		//abc
System.out.println(sb1.length());	//3
System.out.println(sb1.capacity());	//16+3=19

StringBuilder sb2 = new StringBuilder(3);
System.out.println(sb2.length());	//0
System.out.println(sb2.capacity());	//3

sb2.append("abc");
System.out.println(sb2);		//abc
System.out.println(sb2.length());	//3
System.out.println(sb2.capacity());	//3

sb2.append('d');
System.out.println(sb2);		//abcd
System.out.println(sb2.length());	//4
System.out.println(sb2.capacity());	//8 newcapacity = (oldcapacity + 1)*2

sb2.ensureCapacity(50);
System.out.println(sb2);		//abcd
System.out.println(sb2.length());	//4
System.out.println(sb2.capacity());	//50

sb2.setLength(2);
System.out.println(sb2);		//ab
System.out.println(sb2.length());	//2
System.out.println(sb2.capacity());	//50

sb2.trimToSize();
System.out.println(sb2);		//ab
System.out.println(sb2.length());	//2
System.out.println(sb2.capacity());	//2

System.out.println(sb2.charAt(0));	//a

sb2.setCharAt(0,'A');
System.out.println(sb2);		//Ab

sb2.deleteCharAt(0);
System.out.println(sb2);		//b

sb2.append("cde");
System.out.println(sb2);		//bcde

sb2.insert(0,'a');
System.out.println(sb2);		//abcde

sb2.delete(1,3);
System.out.println(sb2);		//ade

sb2.reverse();
System.out.println(sb2);		//eda

}

}