import java.util.Scanner;
class Demo29
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
char ch[] = s.toCharArray();
s = "";
for(int i=0;i<ch.length;i++)
{
if(ch[i]<='9' && ch[i]>='0')
switch(ch[i]){
case '0':
	s += "zero ";
	break;
case '1':
	s += "one ";
	break;
case '2':
	s += "two ";
	break;
case '3':
	s += "three ";
	break;
case '4':
	s += "four ";
	break;
case '5':
	s += "five ";
	break;
case '6':
	s += "six ";
	break;
case '7':
	s += "seven ";
	break;
case '8':
	s += "eight ";
	break;
case '9':
	s += "nine ";
	break;
}
}
System.out.println(s);
/*
19234
one nine two three four

417051
four one seven zero five one
*/
}
}