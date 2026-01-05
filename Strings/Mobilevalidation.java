import java.util.*;
import java.util.regex.*;
class Gmailvalidation
{

public static void main(String ...args)
{
Scanner obj = new Scanner(System.in);
String s = obj.next();
System.out.println(s +" is valid gmail id "+s.matches("[a-z][a-z0-9_][a-z0-9_]+@gmail[.]com"));
}

}
/*
1234
1234 is valid mobile number false
1234567890
1234567890 is valid mobile number false
6372006220
6372006220 is valid mobile number true
*/