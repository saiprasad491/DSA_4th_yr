import java.util.Scanner;
class Demo10
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
int count = 0;
for(int i=0;i<s.length();i+=1)
{
char ch = s.charAt(i);
if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
{
count++;
}
}
System.out.println("Number of vowels = "+count+" and number of consonants = "+(s.length()-count));

}
}
/*
Saiprasad
Number of vowels = 4 and number of consonants = 5
*/
