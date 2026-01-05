import java.util.Scanner;
class Demo20
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String[] str = s.split(" ");
for(int i=0;i<str.length;i+=1){
System.out.print((str[i].charAt(0)+"").toUpperCase()+str[i].substring(1)+" ");
}
/*
the quick brown fox jumps over the lazy dog
The Quick Brown Fox Jumps Over The Lazy Dog
*/
}
}