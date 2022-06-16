package javaprograms;

public class GlobalLocanVarSame {
	static int i = 10;
	public static void main(String[] args) {
		System.out.println("i = "+i);
		int i =100;
		System.out.println("i = "+i);//Preference is always given to Local
		System.out.println("Global i is = "+GlobalLocanVarSame.i);//If we want Global val, access it like ClassName.VarName
	}

}
