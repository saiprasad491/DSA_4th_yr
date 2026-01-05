import java.util.Scanner;
class Demo17
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String[] str = s.split(" ");
for(String s1:str){
System.out.print(new StringBuffer(s1).reverse().toString()+" ");
}
/*
He is a teacher
eH si a rehcaet
*/
}
}