class BuyRunner
{
public static void main(String[] args)
{
System.out.println("BuyRunner is running");
Buy.product("Shirt",500 );
Buy.product("Shirt",-500 );
Buy.product("dress",2,"Good",5000);
Buy.product("dress",0,"Good",5000);
Buy.bookMovieTicket("Kalki","veeresh",1,100);
Buy.bookMovieTicket("koti","prasanna",0,100);
Buy.buyEgg(100,10);
Buy.buyEgg(8,10);
Buy.buyShampoo(20,2,"clinic plus","4/7/23");
Buy.buyShampoo(10,10,"clinic plus","4/7/20");
Buy.buyCake('m',"pastry","vanilla",200,2);//(char size,String type,String flavour,double cost,int quantity)
Buy.buyCake('s',"pastry","chocolate",30000,3);
Buy.buyLaptop("HP",111,50000,100,18,"intel",450,8);//(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
Buy.buyLaptop("HP",111,40000,100,18,"intel",450,2);
Buy.buySmartWatch("Boat",5000,3,'C',1);//public static void buySmartWatch(String brand,double price,int color,char type,int mode)
Buy.buySmartWatch("Boat",5000,1,'B',2);
}
}
