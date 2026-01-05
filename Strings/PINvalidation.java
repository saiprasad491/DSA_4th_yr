import java.util.*;
import java.util.regex.*;
class PINvalidation
{

public static void main(String ...args)
{
Scanner obj = new Scanner(System.in);
String num = obj.next();
System.out.println(num +" is valid pin number "+num.matches("[0-9]{4}"));
}

}
/*
1
1 is valid pin number false
123
123 is valid pin number false
1239
1239 is valid pin number true
18931
18931 is valid pin number false
*/