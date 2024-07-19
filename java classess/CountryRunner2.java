class CountryRunner2
{
public static void main(String[] args)
{
System.out.println("main is running in CountryRunner2");
System.out.println("-------------------------------------------------------------states-------------------------------------------------");
Country2.states();

System.out.println("--------------------------------------------------------------pincodes---------------------------------------------");
Country2.pincode();
System.out.println("--------------------------------------------------------------prime ministers--------------------------------------");
Country2.primeMinister();
System.out.println("-------------------------------------------------------------cabinetMinisters---------------------------------------");
Country2.cabinetMinisters();
System.out.println("---------------------------------------------------------------politicalParties-------------------------------------");
Country2.politicalParties();
System.out.println("main execution ends");

}
}