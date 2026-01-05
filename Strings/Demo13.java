import java.util.Scanner;
import java.util.Arrays;
class Demo13
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = new StringBuffer(s1).reverse().toString();

System.out.println(s1+" is palindrome "+s1.equals(s2));
/*
madam
madam is palindrome true

malayalam
malayalam is palindrome true

car
car is palindrome false
*/
}
}