class AssignmentOnParameters
{
public static void main(String[] args)
{
System.out.println("AssignmentOnParameters is running");

System.out.println(" Paint is running");

Paint.paintBrand("Nippon");
Paint.paintBrandWithColor("Asian Paints "," Teal");
Paint.paintBrandWithPrice("Asian paint", 1200.345666);
Paint.paintColorWithType("Blue","oil paint",3400.89678);

System.out.println("Train is running");
Train.book("bangalore ","hassan");
Train.book("bangalore ","hassan",2);
Train.book("bangalore ","hassan" ,2,5670.09009);
Train.cancel(5670);
Train.cancel("kadur","tarikere");

System.out.println("Mobile Phone is running");
MobilePhone.brandName("vivo");
MobilePhone.phoneNumber(7483381416L);
MobilePhone.phone(9591529036L,10000.500);
MobilePhone.phone(96,"B-Type");
MobilePhone.phoneNumber(9591529036L, 91);


}
}