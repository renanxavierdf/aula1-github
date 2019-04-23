package application;

public class Program7 {

	public static void main(String[] args) {
		String[] vect = new String[] { "10.0", "2.0", "3.0" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("---------------------------------------");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
