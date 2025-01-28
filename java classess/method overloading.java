Public class vehicle{
	 public  double findCost(){
	 System.out.println("cost of vehicle");
	 return 1234556;
	 }
	 }
	 
	 
	 public class bike inherits Vehicle{
	 public  double findCost(){
	 System.out.println("cost of bike");
	 return 76798;
	 }
	 
	 public class Car inherits Vehicle{
	 public  double findCost(){
	 System.out.println("cost of Car");
	 return 976776798;
	 }
	 
	 public class runner
	 {
	 public static void main(String args)
	 {
	 Bike.findCost();
	 Car.findCost();
	 }
	 }