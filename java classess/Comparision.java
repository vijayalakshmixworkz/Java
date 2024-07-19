class Comparision
{
public static void main(String[] args)
{
	//== double operator
int noOfStudents=20;
int NoOfDaysInAWeek=20;
boolean same=noOfStudents==NoOfDaysInAWeek;//== is double equals operator ,use it for comparision
// to references pointing to same location or not;
System.out.println("same:"+same);

char tShirtSize='M';
char shirtSize='S';
boolean sameShirt=tShirtSize==shirtSize;
System.out.println("sameShirt:"+sameShirt);

boolean rainYesterday=false;
boolean rainToday=false;
//boolean rain=rainYesterday==shirtSize;
//System.out.println("rain:"+rain);

double salary=23.5;
double salary1=24.5;
//boolean rain1=rainYesterday==salary;//incomparable type
//System.out.println("rain1:"+rain1);// boolean with other  datatypes cannot be compared

boolean same2=noOfStudents==tShirtSize;
System.out.println("same2:"+same2);// comparision of char and int always work because of ascii values;
// char and byte,short,double comparision works; upto 127
// 
int small='S';// can store same value in difefrent datatypes
// storing character in int datatype it will return its ascii value
System.out.println("small:"+small);

double height=5.3;
float weight=55.3F;
boolean checkh=height==weight;
System.out.println("checkh:"+checkh);// double with float comparision works;










}
}