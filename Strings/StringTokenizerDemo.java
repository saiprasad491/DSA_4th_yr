import java.util.StringTokenizer;
class StringTokenizerDemo
{
public static void main(String ...args)
{
StringTokenizer st = new StringTokenizer("java is very easy");
System.out.println(st.countTokens()); //4

while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
/*
java
is
very
easy
*/

StringTokenizer st1 = new StringTokenizer("26-12-2025","-");
System.out.println(st1.countTokens()); //3

while(st1.hasMoreTokens())
{
System.out.println(st1.nextToken());
}
/*
26
12
2025
*/

StringTokenizer st2 = new StringTokenizer("11:03:20",":");
System.out.println(st2.countTokens()); //3

while(st2.hasMoreTokens())
{
System.out.println(st2.nextToken());
}
/*
11
03
20
*/
}
}