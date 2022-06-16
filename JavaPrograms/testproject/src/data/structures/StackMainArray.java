package data.structures;

import java.util.Scanner;

class Stack {
	static final int MAX_SIZE = 1000;
	int top;
	int arr[] = new int[MAX_SIZE];
	static int counter = 0;
	public boolean isEmpty() {
		if (top < 0) {
			System.out.println("Stack is Empty/underflowing");
			return (top < 0);
		}
		return (top < 0);
	}

	Stack() {
		top = -1;
	}

	public boolean push(int x) {
		if (top >= MAX_SIZE - 1) {
			System.out.println("Stack overflow");
			return false;
		} else {
			arr[++top] = x;
			System.out.println("Item " + x + " has been added to Stack.");
			counter++;
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = arr[top--];
			counter--;
			return x;
		}
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = arr[top];
			return x;
		}
	}

	public void print() {
		System.out.println("Stack elements are - ");
		for (int i = top; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}
	/*
	 * public int size() { return arr.length; }
	 */
}

public class StackMainArray {
	public static void main(String[] args) {
		Stack st = new Stack();
		int	stackValues;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to be added to stack");
		int n = sc.nextInt();
		System.out.println("Enter Stack Values ");
		for (int i = 0; i < n; i++) {
			stackValues = sc.nextInt();
			st.push(stackValues);
			System.out.println("entered values are : "+stackValues);
		}

		st.print();
		System.out.println("=======size=======");
		System.out.println("size = "+Stack.counter);
		System.out.println("==========pop=========");
		System.out.println("popped item is : "+st.pop());
		st.print();
		System.out.println("==========peek=========");
		System.out.println("Top element = "+st.peek());
		st.print();
		System.out.println("Is stack empty? "+st.isEmpty());
		System.out.println("==========peek=========");
		st.peek();
		st.print();
		System.out.println("=======size=======");
		System.out.println("size = "+Stack.counter);
	}
}