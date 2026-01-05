import java.util.Scanner;
class Demo14
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
s = s.toLowerCase();
boolean flag = true;
for(int i=97;i<=122;i++){
if(s.indexOf(i)<0){
flag = false;
break;
}
}

System.out.println(s+" is pangram "+flag);
/*
the quick brown fox jumps over the lazy dog
the quick brown fox jumps over the lazy dog is pangram true
*/
}
}