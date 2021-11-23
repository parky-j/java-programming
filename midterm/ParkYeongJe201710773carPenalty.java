enum Penalty{
	LIGHT(9, 8, 4), //(8, 7, 5),
	PEDESTRIAN(8, 7, 5), 
	YELLOW(10, 9, 0), 
	BUSONLYHIGHWAY(10, 9, 0), 
	LANE(4, 4, 3),
	OVER60(14, 13, 9), 
	OVER4060(11, 10, 7), 
	OVER2040(12, 11, 8), //(8, 7, 5),
	OVER20(4, 4, 3);
	
	int vanPen;
	int carPen;
	int autoPen;

	Car car;

	private Penalty(int varPen, int carPen, int autoPen){
		this.vanPen = varPen;
		this.carPen = carPen;
		this.autoPen = autoPen;
	}
	private Penalty(int varPen, int carPen){
		this.vanPen = varPen;
		this.carPen = carPen;
	}
}

enum Car{
	VAN, CAR, AUTO;
}

class ParkYeongje201710773CarPenalty{
	int[] fine = new int[3];
	int sum = 0;	

	public ParkYeongje201710773CarPenalty(Penalty[] p, Car c){
		switch(c){
			case VAN:
				for(int i = 0; i < p.length; i++)
					fine[i] = p[i].vanPen;
				break;
			case CAR:
				for(int i = 0; i < p.length; i++)
					fine[i] = p[i].carPen;
				break;
			case AUTO:
				for(int i = 0; i < p.length; i++)
					fine[i] = p[i].autoPen;
				break;
		}
		for(int i = 0; i < fine.length; i++){
			sum += fine[i];
		}
	}
	public ParkYeongje201710773CarPenalty(Penalty p, Car c){
		switch(c){
			case VAN:
				fine[0] = p.vanPen;
				break;
			case CAR:
				fine[0] = p.carPen;
				break;
			case AUTO:
				fine[0] = p.autoPen;
				break;
		}
		for(int i = 0; i < fine.length; i++){
			sum += fine[i];
		}
	}
}