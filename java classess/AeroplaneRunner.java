
class AeroplaneRunner
{
public static void main(String[] args) 
	{
        Aeroplane plane1 = new Aeroplane();
        System.out.println(plane1);

        Aeroplane plane2 = new Aeroplane("Airways", 180, 150.5, "New York", "London");
        System.out.println(plane2);

        Aeroplane plane3 = new Aeroplane("JetLine", "San Francisco", "Tokyo");
        System.out.println(plane3);

        Aeroplane plane4 = new Aeroplane("SkyHigh", 200.0, "Paris", "berlin");
        System.out.println(plane4);
    }
}