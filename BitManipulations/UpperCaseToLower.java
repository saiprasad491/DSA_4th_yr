import java.util.Scanner;
class UpperCaseToLower
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
String ss = "";
for(int i=0;i<s.length();i++)
{
char ch = s.charAt(i);
if(ch>=65 && ch<=90)
ss += (char)(ch|32);
}
System.out.println(ss);
}
}
/*
SAI
sai
*/