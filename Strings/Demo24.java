import java.util.Scanner;
class Demo24
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
String ss = sc.next();
String s1 = ss+ss;
System.out.println(s1.contains(s));
/*
abcde
bcdea
true

casdfg
dfgcas
true
*/
}
}