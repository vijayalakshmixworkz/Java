//DeliveryGuy--> deliver(String item)--->DeliveryVehicle.deliver(item,"FIXED")
class DeliveryGuy
{
public static void deliver(String item)
{
System.out.println("deliver is running in DeliveryGuy");
DeliveryVehicle.deliver(item,"Bhadravathi");
}
}