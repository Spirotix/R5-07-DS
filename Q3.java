public class Q3 
{
	public static void main(String[] args)
	{
		if (args.length != 1) 
		{
			System.err.println("Usage: java Q3 [N]");
			System.exit(1);
		}
		int N = Integer.parseInt(args[0]);
		for (int i = 1; i <= N; i++) 
		{
			System.out.println(i + " ");
		}
	}
}
