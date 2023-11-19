import java.util.Scanner;
public class Q3 {
	//substring(int startIndex); inclusive till end of the string
	//substring(beginIndex, endIndex); (inclusive, exclusive)
	//endIndex: max str.length()'e eþit olabilir.
	public static int findNumberOfA(String str)
	{
		int counter = 0;
		for (int i = 0; i<str.length(); i++)
		{
			if(str.substring(i,i+1).equals("a"))
				counter++;
			/* if(str.chatAt(i)=='a')
			 {
			 	counter++;
			 }
			 */
		}
			return counter;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input;
		while (true)
		{
			System.out.println("Enter String");
			input = scan.nextLine().trim();
			System.out.println(findNumberOfA(input));
		}
	}
}
