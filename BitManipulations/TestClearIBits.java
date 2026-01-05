class TestclearIBits
{
static int clearBits(int n,int i)
{
int bitmask = (-1)<<i;
return n&bitmask;
}

public static void main(String ...args)
{
int n = 19;//10011
System.out.println("clear last 1 bit : "+clearBits(n,1));	//18
System.out.println("clear last 2 bit : "+clearBits(n,2));	//16
System.out.println("clear last 3 bit : "+clearBits(n,3));	//16
System.out.println("clear last 4 bit : "+clearBits(n,4));	//16
System.out.println("clear last 5 bit : "+clearBits(n,5));	//0
/*
clear last 1 bit : 18
clear last 2 bit : 16
clear last 3 bit : 16
clear last 4 bit : 16
clear last 5 bit : 0
*/
}
}