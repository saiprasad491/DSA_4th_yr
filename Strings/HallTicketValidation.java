import java.util.*;
import java.util.regex.*;
class HallTicketValidation
{

public static void main(String ...args)
{
Scanner obj = new Scanner(System.in);
String s = obj.next();
System.out.println(s +" is a valid student "+s.matches("DS\\d{4}"));
}

}
/*
DS9
DS9 is a valid student false
aj83d
aj83d is a valid student false
DS9304
DS9304 is a valid student true

*/