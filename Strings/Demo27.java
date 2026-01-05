import java.util.Scanner;
class Demo27
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
char ch[] = s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]<=122 && ch[i]>=97)
ch[i] -= 32;
}
System.out.println(new String(ch));
/*
Hello
HELLO
*/
}
}