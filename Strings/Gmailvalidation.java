import java.util.*;
import java.util.regex.*;
class Gmailvalidation
{

public static void main(String ...args)
{
Scanner obj = new Scanner(System.in);
String s = obj.next();
System.out.println(s +" is valid gmail id "+s.matches("[.]gmail"));
}

}
