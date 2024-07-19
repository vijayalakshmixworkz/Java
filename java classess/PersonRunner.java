//1. Main to take information of a person: name,email,age,password
class PersonRunner
{
public static void main(String[] args)
{
	System.out.println("Running main in PersonRunner");
			if (args.length==4)

	{
	System.out.println("give 4 arguments");

		String name=args[0];
		String email=args[1];
		String age=args[2];
		String password=args[3];
		System.out.println(" "+ name);
		System.out.println(" "+ email);
		System.out.println(" "+ age);
		System.out.println(" "+ password);


	}
	else
	{
			System.out.println("need to provide arguments");

	}
	
}

}
