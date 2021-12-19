 package Bird;

public class Main {

	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		eagle.claw();
		eagle.bill("Eagle");
		eagle.fly("Eagle");
		eagle.legs("Eagle");
		eagle.feather("Eagle");
		
		Robin robin=new Robin();
		robin.hum();
		robin.bill("Robin");
		robin.legs("Robin");
		robin.feather("Robin");
		
		Chicken chicken=new Chicken();
		chicken.leg_pice();
		chicken.feather("Chicken");
		chicken.bill("Chicken"); 
		chicken.legs("Chicken");
		
		
		Falcon falcon=new Falcon();
		falcon.speed();
		falcon.legs("Falcon");
		falcon.fly("Falcon");
		falcon.bill("Falcon");
		falcon.feather("Falcon	");
		

	}

}
