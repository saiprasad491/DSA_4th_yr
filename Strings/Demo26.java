import java.util.Scanner;
class Demo26
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
int n = s.length();
char ch = s.charAt(0), ch1 = s.charAt(1);
if(n==2 && ch<=104 && ch>=97 && ch1<=56 && ch1>=49)
{
System.out.println("ch+ch1 = "+(ch+ch1));
if((ch+ch1)%2==0)
System.out.println("Black");
else
System.out.println("White");
}
else
System.out.println("Enter valid coordinate of chess board");
/*
a1
ch+ch1 = 146
Black

c1
ch+ch1 = 148
Black

g8
ch+ch1 = 159
White

f5
ch+ch1 = 155
White
*/
}
}