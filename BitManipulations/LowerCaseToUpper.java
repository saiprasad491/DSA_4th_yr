import java.util.Scanner;
class LowerCaseToUpper
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
String ss = "";
for(int i=0;i<s.length();i++)
{
char ch = s.charAt(i);

if(ch>=97 && ch<=122){
ss += (char)(ch^32);
}
else{
ss+=ch;
}

}

System.out.println(ss);
}
}
/*
saiprasadsahoo491@gmail.com
SAIPRASADSAHOO491@GMAIL.COM
*/