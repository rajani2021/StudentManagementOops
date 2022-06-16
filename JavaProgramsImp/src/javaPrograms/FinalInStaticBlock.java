package javaPrograms;
//if we use final for a variable, the class won't be loaded, it'll simply get the value and prints                         
public class FinalInStaticBlock {

	public static void main(String[] args) {
		System.out.println(Main.x);//100
	}

}

class Main{
	public static final int x = 100;
	static {
		System.out.println("Main -- clsss static block");
	}
}
