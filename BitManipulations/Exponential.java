import java.util.Scanner;
class Exponential
{

static int pow(int n,int b)
{
int res = 1;
while(n!=0)
{
if((n&1) != 0){
res = res * b;
}
b*=b;
n>>=1;
}
return res;
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("("+a+", "+b+") = "+pow(a,b));
}
}