class MobilePhone
{
public static void brandName(String brand)
{
System.out.println("method with one string parameter");
System.out.println(" brand: "+brand);
}
public static void phoneNumber(long number)
{
System.out.println("method with long parameter");
System.out.println(" number: "+number);
}
public static void phone(long number,double price)
{
System.out.println("method with long, double parameter");
System.out.println(" number: "+number+" price: "+price);
}
public static void phone(int batteryPercentage,String chargerType)
{
System.out.println("method with 1 int  and 1 string parameter");
System.out.println(" batteryPercentage: "+batteryPercentage+" chargerType: "+chargerType);
}
public static void phoneNumber(long number, int countryCode)
{
System.out.println("method with long and int parameters");
System.out.println(" number: "+number+" countryCode: "+countryCode);
}

}
