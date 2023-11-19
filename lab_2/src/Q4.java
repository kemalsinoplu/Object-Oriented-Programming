public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JAMIE OLIVER";
		String str2 = "JULIA ROBERT";
		
		double counter = 0;
		for (int i=0; i<str1.length(); i++)
		{
			if(str1.substring(i, i+1).equals(str2.substring(i, i+1)))
				counter++;
		}
		double result = (counter/str1.length())*100;
		System.out.println("number of same characters: "+counter);
		System.out.println("similarity percentge: "+result);
		System.out.printf("similarity percenage is %.3f", result);
	}
}