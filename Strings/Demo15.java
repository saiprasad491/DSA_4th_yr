import java.util.Scanner;
import java.util.StringTokenizer;
class Demo15
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
StringTokenizer st = new StringTokenizer(s,",");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
/*
Saiprasad is a very good student
Saiprasad
is
a
very
good
student

hello, good morning
hello
 good morning
*/

}
}