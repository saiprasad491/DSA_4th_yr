import java.util.Scanner;
class FastExpo
{
static int fastExpo(int a, int n)
{
int res = 1;
while(n != 0)
{
if((n&1)!=0)
	res = res * a;
a = a * a;
n = n>>1;
}
return res;
}
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int n = sc.nextInt();
System.out.println(a+" to the power "+n+" = "+fastExpo(a,n));
}
}
/*
2
8
2 to the power 8 = 256

3
4
3 to the power 4 = 81

12
0
12 to the power 0 = 1

0
2
0 to the power 2 = 0
*/