class Bike
{
public static void main(String[] args)
{
}
public static void start()
{
	System.out.println("calls next function");

stop();
}
public static void stop()
{
	System.out.println(" calls previous function");

start();
}

}