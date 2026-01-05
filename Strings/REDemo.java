import java.util.regex.*;
class REDemo
{
public static void main(String ...args)
{
Pattern p = Pattern.compile("[0-9]");
Matcher m = p.matcher("a1e5i9o15u21");
int c = 0;
while(m.find())
{
System.out.println(m.start()+" --> "+m.end()+" --> "+m.group());
c++;
}
System.out.println("Count = "+c);
/*
1 --> 2 --> 1
3 --> 4 --> 5
5 --> 6 --> 9
7 --> 8 --> 1
8 --> 9 --> 5
10 --> 11 --> 2
11 --> 12 --> 1
Count = 7
*/
Pattern p1 = Pattern.compile("[a-z]");
Matcher m1 = p1.matcher("a1e5i9o15u21");
c = 0;
while(m1.find())
{
System.out.println(m1.start()+" --> "+m1.end()+" --> "+m1.group());
c++;
}
System.out.println("Count = "+c);
/*
0 --> 1 --> a
2 --> 3 --> e
4 --> 5 --> i
6 --> 7 --> o
9 --> 10 --> u
Count = 5
*/
}
}