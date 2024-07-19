class DataRunner
{
public static void main(String[] args)
{
	// addition
int start=4;
int end=3;
int result=start+end;// result 7 will stored in constant pool

start=start+end;//reassignement
boolean same=result==start;// same is pointing to the location of the equation
System.out.println(same);//explicit reeference
System.out.println(result);//explicit reeference because we declare it and we call it;
System.out.println(10);//value will be stored in constant pool // it take location of 10 snd passes it to println
// we dont have reference to 10 in this program therefore it is IMPLICIT REFERRENCE
int doorNo=67;
System.out.println(67);//explicit reference
System.out.println(99);//implicit reference
String door="n121";
System.out.println("door no is:"+door);// string conacatenation belongs to  implicit reference. implicit reference within ""'
System.out.println(7+8);// result is also implicit reference
System.out.println("door no is:"+start);// concatenation of string and integer
System.out.println("A"+"B");// it have 3  implicit ssreferences A,B,AB


}
}
