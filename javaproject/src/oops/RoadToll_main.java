package oops;

public class RoadToll_main {

	public static void main(String[] args) {
		Road_toll rt1=new Road_toll();
		rt1.tiresCount=4;
		rt1.type="sedan";
		rt1.calculateToll();
		
		Road_toll rt2 = new Road_toll("Truck", 6);
		rt2.calculateToll();

	}

}
