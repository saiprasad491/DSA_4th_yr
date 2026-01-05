import java.util.Scanner;
import java.util.Arrays;
class Demo11
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
char ch[] = s.toCharArray();
Arrays.sort(ch);
s = new String(ch);
System.out.println(s);
}
}
/*
Saiprasad
Saaadiprs

jajkjkals
aajjjkkls
*/
