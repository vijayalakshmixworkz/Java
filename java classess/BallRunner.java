package com.xworkz.engineering;

public class BallRunner {

		public static void main(String[] args) 
		{
		        // Creating instances of the Ball class
		        Ball soccerBall = new Ball("Nike", "White", 11.0f, "Leather", "Soccer", 450, true, 1.2f);
		        Ball basketball = new Ball("Spalding", "Orange", 12.0f, "Synthetic", "Basketball", 600, true, 1.5f);
		        Ball tennisBall = new Ball("Wilson", "Yellow", 6.7f, "Rubber", "Tennis", 58, false, 0.8f);

		        // Setting additional attributes for each ball
		        soccerBall.Attributes("Nike Inc.", "USA", "Soccer", "Outdoor", 22.0f, 69.0f, 10, 32, "Synthetic", "Rubber", 29.99f, 
		                                            "Sports Store", true, "High", true, true, "Adults");
		        
		        basketball.Attributes("Spalding", "China", "Basketball", "Indoor", 24.0f, 75.0f, 9, 30, "Composite", "Rubber", 49.99f, 
		                                            "Sports Store", true, "Very High", true, true, "Adults");

		        tennisBall.Attributes("Wilson", "Thailand", "Tennis", "Outdoor", 6.7f, 21.1f, 14, 0, "Felt", "Rubber", 3.99f, 
		                                            "Sports Store", true, "Medium", false, false, "All Ages");

		        // Creating an array to hold the Ball objects
		        Ball[] balls = new Ball[3];
		        balls[0] = soccerBall;
		        balls[1] = basketball;
		        balls[2] = tennisBall;

		        // Looping through the array and displaying the details of each Ball
		        for (Ball ballDetails : balls) 
		        {
		            System.out.println(ballDetails);
		            ballDetails.display();
		        }
		    }
		

}