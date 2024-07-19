//3. Main to take information of a palace: name,location,builtBy,buildYear
class palaceRunner
{
public static void main(String[] args)
{
	System.out.println("Running main in PersonRunner");
			if (args.length==4)

	{
	System.out.println("give 4 arguments");

		String name=args[0];
		String location=args[1];
		String builtBy=args[2];
		String buildYear=args[3];
		System.out.println(" "+ name);
		System.out.println(" "+ location);
		System.out.println(" "+ builtBy);
		System.out.println(" "+ buildYear);


	}
	else
	{
			System.out.println("need to provide arguments");

	}
	
}

}