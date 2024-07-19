//DeliveryVehicle---> deliver(String item,String location)--->Company.deliver(item,location);
class DeliveryVehicle
{
public static void deliver(String item,String location)
{
System.out.println("deliver is running DeliveryVehicle");
Company.deliver(item,location);
}
}