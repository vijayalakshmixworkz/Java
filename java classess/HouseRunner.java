//Dog---> guarding(String location)
//House---> watch(String location)---> Dog.guarding(location)
//main()---> House.watch("Gate");
class HouseRunner
{
public static void main(String[] args)
{
System.out.println("HouseRunner is running");
House.watch("Gate");
}
}