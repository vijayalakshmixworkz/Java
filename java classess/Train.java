class Train
{
public static void book(String source,String destination)
{
System.out.println("book method with two string parameters");
System.out.println(" source: "+source+" destination: "+destination);
}

public static void book(String source,String destination,int quantity)
{
System.out.println(" method with two strings and 1 int parameters");
System.out.println(" source: "+source+" destination: "+destination+" quantity: "+quantity);
}

public static void book(String source,String destination, int quantity,double price)
{
System.out.println(" method with two string parameters");
System.out.println(" source: "+source+" destination: "+destination+" quantity: "+quantity+" price: "+price);
}

public static void cancel(int ticketNo)
{
System.out.println("method with int parameter");
System.out.println(" ticketNo: "+ticketNo);
}
public static void cancel(String source,String destination)
{
System.out.println(" cancel method with two string parameters");
System.out.println(" source: "+source+" destination: "+destination);
}

}