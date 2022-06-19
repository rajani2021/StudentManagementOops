package student.management.oops;

public class StudentManagement {

	public static void main(String[] args) {
		Student st = new Student();
		Student st1 = new Student(123, "test",67.89,2022,"BSc");
		Student st2 = new Student(123, "test",67.89,2022,"BSc");
		Student st3 = st1;
		
		st.setDegree("BA");
		st.setName("test2");
		st.setPercentage(78.9);
		st.setYop(2021);
		System.out.println("st = "+st);
		System.out.println("st1 = "+st1);
		
		System.out.println("st.equals(st1) : "+st.equals(st1));
		System.out.println("st1.equals(st2) : "+st1.equals(st2));
		System.out.println("st1.equals(st3) : "+st1.equals(st3));
		
		boolean b = st.equals(st3);
		
		Object obj = new Student();
		b = st.equals(obj);

	}

}
