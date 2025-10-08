public class Q6
{
	public static void main(String[] args)
	{
		if (args.length != 1) 
		{
			System.err.println("Usage: java Q4 [N]");
			System.exit(1);
			
		}
		int N = Integer.parseInt(args[0]);
		for (int i = N; i >= 1; i--) 
		{
			for (int j = i; j <= i; j++) 
			{
				System.out.print("X" + " ");
			}
			System.out.println();
		}
	}
}
