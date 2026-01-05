import java.util.Scanner;
import java.util.Arrays;
class Demo12
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = sc.next();
char[] ch1 = s1.toCharArray();
char[] ch2 = s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
System.out.println(Arrays.equals(ch1,ch2));
/*
race
care
true
*/
}

}