import java.util.Scanner;
class IncrementByOne
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
System.out.println("After incrementing "+n+" by one unit "+-(~n));
}
}
/*
45
After incrementing 45 by one unit 46

-2
After incrementing -2 by one unit -1
*/