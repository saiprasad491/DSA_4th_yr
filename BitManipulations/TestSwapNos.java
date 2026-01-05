import java.util.Scanner;
class TestSwapNos
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Before swapping a = "+a+", b = "+b);
a = a^b;
b = a^b;
a = a^b;
System.out.println("After swapping a = "+a+", b = "+b);
/*
12
9
Before swapping a = 12, b = 9
After swapping a = 9, b = 12
*/
}
}