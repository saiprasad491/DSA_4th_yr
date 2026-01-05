import java.util.Scanner;
class Demo16
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String s1 = new StringBuffer(s).reverse().toString();
System.out.println(s1);
}
/*
He is a teacher.
.rehcaet a si eH
*/
}