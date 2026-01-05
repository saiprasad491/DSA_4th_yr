class TestEvenOdd
{
static String evenOdd(int i)
{
return (i&1)==0?"Even":"Odd";
}
public static void main(String ...args)
{
for(int i=1;i<=5;i+=1)
{
System.out.println(i+" is "+evenOdd(i));
}
/*
1 is Odd
2 is Even
3 is Odd
4 is Even
5 is Odd
*/
}
}