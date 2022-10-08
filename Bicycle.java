class Bicycle{
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	void changeCadence(int newValue){
		cadence = newValue;
	}
	
	void printState(){
		System.out.println("cadence: " + cadence + " Gear: " + gear + " Speed: " + speed);
	}
	
	void changeGear(int newValue){
		gear = newValue;
	}
	
	void speedUp(int addSpeed){
		speed = speed + addSpeed;
	}
	
	void applyBreak(int reduceSpeed){
		speed = speed - reduceSpeed;
	}
	
}