import java.util.Scanner;
class Demo19
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String[] str = s.split(" ");
for(int i=0;i<str.length;i+=1){
if(str[i].length()%2==0)
System.out.print(new StringBuffer(str[i]).reverse().toString()+" ");
else
System.out.print(str[i]+" ");
}
/*
the quick brown fox jumps over the lazy dog
the quick brown fox jumps revo the yzal dog
*/
}
}