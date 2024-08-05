 
 class KeroseneRunner
 {
 public static void main(String[] args) 
	{
       
        Kerosene kerosene1 = new Kerosene();
        System.out.println(kerosene1);

        Kerosene kerosene2 = new Kerosene(50.5, 100, true);
        System.out.println(kerosene2);

        Kerosene kerosene3 = new Kerosene(true);
        System.out.println(kerosene3);

        Kerosene kerosene4 = new Kerosene(75.0);
        System.out.println(kerosene4);
    }
}