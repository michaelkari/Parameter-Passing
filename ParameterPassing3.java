public class ParameterPassing3{
	public static void main (String[] args) {
			String line1 = "ABC";
			String line2 = "DEF";
			swap (line1, line2);
			System.out.println(line1+ " "+ line2);
	}
	public static void swap (String s1, String s2) {
		String temp;
		temp = s1;
		s1 = s2;
		s2 = temp;
	}
}