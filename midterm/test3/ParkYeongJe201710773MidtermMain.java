//201710773 Park yeong je
import java.util.*;

public class ParkYeongje201710773MidtermMain{
	public static void main(String[] args){
		Penalty case1 = Penalty.OVER2040;
		Penalty[] case2 = {Penalty.LIGHT, Penalty.YELLOW};
		Penalty[] case3 = {Penalty.BUSONLYHIGHWAY, Penalty.OVER60};

		Car c[] = {Car.AUTO, Car.VAN, Car.CAR};

		ParkYeongje201710773CarPenalty[] casePenalty = {new ParkYeongje201710773CarPenalty(case1, c[0]),
							new ParkYeongje201710773CarPenalty(case2, c[1]),
							new ParkYeongje201710773CarPenalty(case3, c[2])};


		for(int i = 0; i <= 2; i++){
			System.out.println("CASE "+ (i+1) + ": fine: "+casePenalty[i].sum);
		}

		int totalFine = 0;
		for(int i = 0 ; i < 10; i++){
			Car car = null;
			Penalty penalty = null;
			int fine = 0;
			int carRand = (int) (Math.random() * 3) + 1;
			int penRand = (int) (Math.random() * 9) + 1;

			if(carRand == 1)
					car = Car.VAN;
			else if(carRand == 2)
					car = Car.CAR;
			else if(carRand == 3)
					car = Car.AUTO;

			if(penRand == 1)
					penalty = Penalty.LIGHT;
			else if(penRand == 2)
					penalty = Penalty.PEDESTRIAN;
			else if(penRand == 3)
					penalty = Penalty.YELLOW;
			else if(penRand == 4)
					penalty = Penalty.BUSONLYHIGHWAY;
			else if(penRand == 5)
					penalty = Penalty.LANE;
			else if(penRand == 6)
					penalty = Penalty.OVER60;
			else if(penRand == 7)
					penalty = Penalty.OVER4060;
			else if(penRand == 8)
					penalty = Penalty.OVER2040;
			else
					penalty = Penalty.OVER20;
			
			switch(car){
				case VAN:
					fine = penalty.vanPen;
					break;
				case CAR:
					fine = penalty.carPen;
					break;
				case AUTO:
					fine = penalty.autoPen;
					break;
			}
			totalFine += fine;
			System.out.println("car: " + car + ", violation: " + penalty + ", fine: " + fine);
		}
		System.out.println("Total fine: " + totalFine);
	}
}