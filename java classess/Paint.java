class Paint
{
public static void paintBrand(String brand)
{
System.out.println("method with string parameter");
System.out.println(" brand: "+brand);
}
public static void paintBrandWithColor(String brand,String color)
{
System.out.println("method with two string parameters");
System.out.println(" brand: "+brand+" color: "+color);


}
public static void paintBrandWithPrice(String brand, double price)
{
System.out.println("method with string,int parameters");
System.out.println(" brand: "+brand+" price: "+price);

}
public static void paintColorWithType(String color,String type,double price)
{
System.out.println("method with 2 string and 1 int parameter");
System.out.println(" color: "+color+" type: "+type+" price: "+price);


}

}