//Company---> deliver(String item,String location);

//DeliveryVehicle---> deliver(String item,String location)--->Company.deliver(item,location);


//main()----> DeliveryGuy.deliver("item");
class DeliveryGuyRunner
{
public static void main(String[] args)
{
System.out.println("DeliveryGuyRunner is running in main");
DeliveryGuy.deliver("Chicken");
}
}