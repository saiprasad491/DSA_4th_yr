
class StringsDemo
{

public static void main(String[] args)
{
String s = new String();
System.out.println(s);			//
System.out.println(s.length());		//0
System.out.println(s.isEmpty());	//true

String s1 = new String("abcd");
System.out.println(s1);			//abcd
System.out.println(s1.length());	//4
System.out.println(s1.isEmpty());	//false

char[] ch = {'S','a','i'};
String s2 = new String(ch);
System.out.println(s2);			//Sai

String s3 = new String(ch,1,2);
System.out.println(s3);			//ai

byte[] b = {97,98,99,100};
String s4 = new String(b);
System.out.println(s4);			//abcd

StringBuffer sb = new StringBuffer("prasad");
String s5 = new String(sb);
System.out.println(s5);			//prasad

StringBuilder sb1 = new StringBuilder(" Sahoo");
String s6 = new String(sb1);
System.out.println(s6);			// Sahoo

System.out.println("java is very easy".startsWith("java")); //true

System.out.println("java is very easy".endsWith("easy"));  //true

System.out.println("java".equals("java")); //true
System.out.println("java".equals("Java")); //false

System.out.println("java".equalsIgnoreCase("java")); //true
System.out.println("java".equalsIgnoreCase("Java")); //true

System.out.println(java.util.Arrays.toString("Saiprasad".toCharArray())); //[S, a, i, p, r, a, s, a, d]

System.out.println(java.util.Arrays.toString("Saiprasad".getBytes())); //[83, 97, 105, 112, 114, 97, 115, 97, 100]

System.out.println("abcd".charAt(0)); //a

System.out.println("abcda".indexOf('a')); //0

System.out.println("abcda".lastIndexOf('a')); //4

System.out.println("abcda".substring(1)); //bcda
System.out.println("abcda".substring(1,3)); //bc

System.out.println("Sai".concat("prasad")); //Saiprasad

System.out.println("ai".replace('a','b'));  //bi

System.out.println("Sai".toUpperCase()); //SAI

System.out.println("Sai".toLowerCase()); //sai

System.out.println(java.util.Arrays.toString("26-12-2025".split("-")));	//[26, 12, 2025]

}

}