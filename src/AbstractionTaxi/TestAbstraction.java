package AbstractionTaxi;

public   class TestAbstraction {

	public static void main(String[] args) {
		Taxi A=new Taxi ();
		Bus  B=new Bus();
		Motorcyle C=new Motorcyle();
		A. bookRide ("Taxi");
		B. bookRide ("Bus");
		C. bookRide ("Motorcyle");
	}

}
