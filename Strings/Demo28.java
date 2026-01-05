import java.util.Scanner;
class Demo28
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
char ch[] = s.toCharArray();
s = "";
for(int i=0;i<ch.length;i++)
{
if(ch[i]<='z' && ch[i]>='a' || ch[i]<='Z' && ch[i]>='A' || ch[i]<='9' && ch[i]>='0' && ch[i]==' ')
s += ch[i];
}
System.out.println(s);
/*
hdajk@88 @9
hdajk
*/
}
}