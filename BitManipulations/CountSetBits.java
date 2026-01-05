import java.util.Scanner;
class CountSetBits
{
static int countBits(int n)
{
int c=0;
while(n>0){
if((n&1)!=0)c++;
n>>=1;
}
return c;
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println("Number of bits in "+n+" = "+countBits(n));
/*
15
Number of bits in 15 = 4

4
Number of bits in 4 = 1
*/
}
}