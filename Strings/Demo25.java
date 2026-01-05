import java.util.Scanner;
class Demo25
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
int n = s.length();
if(n%2 == 0){
System.out.println("Middle character of "+s+" is "+s.substring(n/2-1,n/2+1));
}
else{
System.out.println("Middle character of "+s+" is "+s.charAt(n/2));
}
/*
abcd
Middle character of abcd is bc

abcde
Middle character of abcde is c

a
Middle character of a is a
*/
}
}