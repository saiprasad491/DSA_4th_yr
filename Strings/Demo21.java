import java.util.Scanner;
class Demo21
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String[] str = s.split(" ");
for(int i=0;i<str.length;i+=1){
int n = str[i].length();
System.out.print((str[i].charAt(0)+"").toUpperCase()+str[i].substring(1,n-1)+(str[i].charAt(n-1)+"").toUpperCase()+" ");
}
/*
the quick brown fox jumps over the lazy dog
ThE QuicK BrowN FoX JumpS OveR ThE LazY DoG
*/
}
}