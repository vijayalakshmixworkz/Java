// String 
// sequence of characters
// non primitive
// used with double quotes""
//no of characters=127
// one sequence in one string.
// String S caps
// string can be any big
//non primitive  class lies in jdk -->jre--> lib--> rt run time--> java-->there is non primitive datatypes.
class Pstring
{
	public static void main (String[] args)
	{
		String password=" Rakshith Shetty"; // string is the datatype, password is the reference name, Rakshith Shetty is the value, reference points to the address of value;
		System.out.println("password:"+password);
		String value="address"+"is "+ "required";// string concatenation is done using + operator
		String value2= password+ " is good";// string combination 
				System.out.println("value2:"+value2);
		String value3= value+value2;// string combination
						System.out.println(value3);

		

	}
}