import java.util.Scanner;
class TestPowerOfTwo
{
static String pow(int n)
{
return ((n&(n-1))==0)?"Yes":"No";
}
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(n+" is power of two "+pow(n));
/*
1
1 is power of two Yes

2
2 is power of two Yes

3
3 is power of two No

4
4 is power of two Yes
*/
}
}