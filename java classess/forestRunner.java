//2. Main to take information of a forest: name,area,establishedYear,state	

class forestRunner
{
public static void main(String[] args)
{
	System.out.println("Running main in PersonRunner");
			if (args.length==4)

	{
	System.out.println("give 4 arguments");

		String name=args[0];
		String area=args[1];
		String establishedYear=args[2];
		String state=args[3];
		System.out.println(" "+ name);
		System.out.println(" "+ area);
		System.out.println(" "+ establishedYear);
		System.out.println(" "+ state);


	}
	else
	{
			System.out.println("need to provide arguments");

	}
	
}

}
