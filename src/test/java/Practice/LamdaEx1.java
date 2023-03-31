package Practice;

interface Ex {
	abstract public void test1();
	}
public class LamdaEx1 {
	public static void main(String[] args) {
		int a =10;
		Ex obj =()-> {  //lambda Expressions
			
		System.out.println("Value of a is = "+a);
		};
		obj.test1();
	}
}

