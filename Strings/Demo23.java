import java.util.Scanner;
class Demo23	//american keyword
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
String r1 = "qwertyuiop";
String r2 = "asdfghjkl";
String r3 = "zxcvbnm";
int c1 = 0, c2 = 0, c3 = 0;
for(int i=0;i<s.length();i+=1){
if(r1.contains(s.charAt(i)+"")) c1++;
if(r2.contains(s.charAt(i)+"")) c2++;
if(r3.contains(s.charAt(i)+"")) c3++;
}
System.out.println(s.length() == c1 || s.length() == c2 || s.length() == c3 );

/*
dad
true

mama
false

you
true
*/
}
}