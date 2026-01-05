
import java.util.Scanner;
class Test
{
static long decToBin(int n)
{
long ans=0;
int i=1;
while(n>0)
{
ans += (n%2) * i;
i *= 10;
n /= 2;
}
return ans;
}

static int decToOct(int n)
{
int ans=0,i=1;
while(n>0)
{
ans += (n%8) * i;
i *= 10;
n /= 8;
}
return ans;
}

static String decToHex(int n)
{
if(n==0) return "0";
StringBuilder ans = new StringBuilder("");
while(n>0)
{
int ld=n%16;

char ch = (ld<10)?(char)(ld+'0'):(char)(ld-10+'a');

ans.insert(0,ch);

n /= 16;
}
return ans.toString();
}

public static void main(String ...arg)
{
System.out.println("Decimal\t"+"Binary\t"+"Octal\tHexadecimal");
for(int i=0;i<=20;i++)
{
System.out.println(i+"\t"+decToBin(i)+"\t"+decToOct(i)+"\t"+decToHex(i));
}
/*
Decimal Binary  Octal   Hexadecimal
0       0       0       0
1       1       1       1
2       10      2       2
3       11      3       3
4       100     4       4
5       101     5       5
6       110     6       6
7       111     7       7
8       1000    10      8
9       1001    11      9
10      1010    12      a
11      1011    13      b
12      1100    14      c
13      1101    15      d
14      1110    16      e
15      1111    17      f
16      10000   20      10
17      10001   21      11
18      10010   22      12
19      10011   23      13
20      10100   24      14
*/
}
}