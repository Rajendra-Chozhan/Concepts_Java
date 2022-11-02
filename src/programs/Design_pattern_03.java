package programs;

public class Design_pattern_03 {

	public static void main(String args[]) {
	int rows = 10;
	System.out.println("\nThe star pattern is... ");
	for (int m = 1; m <= rows; m++)
	{
	for (int n=rows; n>m; n--)
	{
	System.out.print(" ");
	}
	for (int p=1; p<=(m * 2) -1; p++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	}
}
