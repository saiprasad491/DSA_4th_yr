class TestBitOperations
{
static int getBit(int n,int i)
{
int bitMask = 1<<i;
return (n&bitMask)==0?0:1;
} 

static int setBit(int n,int i)
{
int bitMask = 1<<i;
return n|bitMask;
}

static int clearBit(int n,int i)
{
int bitmask=~(1<<i);
return n&bitmask;
}

static int updateBit(int n,int i)
{
int bitMask = 1<<i;
return n^bitMask;
}

public static void main(String ...args)
{
int n=19;
//	10011
//	43210
System.out.println("0th bit of 19 = "+getBit(n,0));
System.out.println("1st bit of 19 = "+getBit(n,1));
System.out.println("2nd bit of 19 = "+getBit(n,2));
System.out.println("3rd bit of 19 = "+getBit(n,3));
System.out.println("4th bit of 19 = "+getBit(n,4));
/*
0th bit of 19 = 1
1st bit of 19 = 1
2nd bit of 19 = 0
3rd bit of 19 = 0
4th bit of 19 = 1
*/
System.out.println("setting 0th bit of 19 = "+setBit(n,0));	//19
System.out.println("setting 1st bit of 19 = "+setBit(n,1));	//19
System.out.println("setting 2nd bit of 19 = "+setBit(n,2));	//23
System.out.println("setting 3rd bit of 19 = "+setBit(n,3));	//27
System.out.println("setting 4th bit of 19 = "+setBit(n,4));	//19
/*
setting 0th bit of 19 = 19
setting 1st bit of 19 = 19
setting 2nd bit of 19 = 23
setting 3rd bit of 19 = 27
setting 4th bit of 19 = 19
*/
System.out.println("clearing 0th bit of 19 = "+clearBit(n,0));	//18
System.out.println("clearing 1st bit of 19 = "+clearBit(n,1));	//17
System.out.println("clearing 2nd bit of 19 = "+clearBit(n,2));	//19
System.out.println("clearing 3rd bit of 19 = "+clearBit(n,3));	//19
System.out.println("clearing 4th bit of 19 = "+clearBit(n,4));	//3
/*
clearing 0th bit of 19 = 18
clearing 1st bit of 19 = 17
clearing 2nd bit of 19 = 19
clearing 3rd bit of 19 = 19
clearing 4th bit of 19 = 3
*/
System.out.println("updating 0th bit of 19 = "+updateBit(n,0));	//18
System.out.println("updating 1st bit of 19 = "+updateBit(n,1));	//17
System.out.println("updating 2nd bit of 19 = "+updateBit(n,2));	//23
System.out.println("updating 3rd bit of 19 = "+updateBit(n,3));	//27
System.out.println("updating 4th bit of 19 = "+updateBit(n,4));	//3
/*
updating 0th bit of 19 = 18
updating 1st bit of 19 = 17
updating 2nd bit of 19 = 23
updating 3rd bit of 19 = 27
updating 4th bit of 19 = 3
*/
}
}