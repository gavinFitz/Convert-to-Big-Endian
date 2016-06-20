import java.util.*;
public class bigEndian
{
		public static void main (String args[])
	{
		//hard way
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		int reverse = swap(num);
		int base1 = sc1.nextInt();
		int base2 = sc1.nextInt();
		String s1 =	baseConverter(base1, base2, reverse);

		//Easy way
		System.out.println(Integer.toBinaryString(-2));
	}

	public static String baseConverter(int base1, int base2, int num)
	{
		int base11 = base1;
		int base21 = base2;
		String num1 = Integer.toString(num);
		int value = Integer.parseInt(num1, base11);
		String output = Integer.toString(value, base21);
		return (output);
	}

	public static int swap (int value)
  	{
    	int b1 = (value >>  0) & 0xff;
    	int b2 = (value >>  8) & 0xff;
    	int b3 = (value >> 16) & 0xff;
    	int b4 = (value >> 24) & 0xff;

    	return b1 << 24 | b2 << 16 | b3 << 8 | b4 << 0;
  	}
}