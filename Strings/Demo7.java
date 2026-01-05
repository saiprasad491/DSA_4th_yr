import java.util.Scanner;
class Demo7
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String name = sc.next();
for(int i=0;i<name.length();i++)
{
System.out.println("Character at index "+i+" = "+name.charAt(i));
}
}
}
/*
Sai
Character at index 0 = S
Character at index 1 = a
Character at index 2 = i
*/