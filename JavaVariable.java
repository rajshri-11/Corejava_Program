package ANP_D0453;
/*Comments in java:comments provide explanation of source code.complier does not compile comment.
  1.Single line :add a comment on only one line use forwarded slashes //
  2. Multiline comment:  multiline (or, multiple-line) comments start with a forward slash followed by an asterisk (/*) and end with an asterisk followed by a forward slash and they are used to add comment on multiple lines.
  3.Documentation Comment: it is used to create html documentation. Syntax:/**     */

/*Types of variable:
   1. local variable: declared inside method,constructor,block
   2. instance variable// is declared inside class but outside methods,construtor,block
   3.class variable/static variable:class variable also called static variable declared using static keyword

 */


public class JavaVariable 
{
	String s="Sai";// instance variable
	static boolean static_variable;

	void display()
	{

		int a=20;//local variable
		System.out.println("a="+a); //a=20
		System.out.println(" inside method s="+s);

	}
	JavaVariable()//default constuctor
	{
		int x=10;//local variable
		System.out.println("x="+x);
		System.out.println(" inside construtor s="+s);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Static Variable="+JavaVariable.static_variable);
		JavaVariable  obj=new  JavaVariable ();//object creation
		obj.display();
		System.out.println(" using object s="+obj.s);


	}

}
