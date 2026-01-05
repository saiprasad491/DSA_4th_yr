import java.util.Scanner;
class Demo9
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
for(int i=0;i<s.length();i+=1)
{
char ch = s.charAt(i);
if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
{
System.out.println("index["+i+"] = "+s.charAt(i));
}

}

}
}
/*
Saiprasad
index[1] = a
index[2] = i
index[5] = a
index[7] = a
*/
