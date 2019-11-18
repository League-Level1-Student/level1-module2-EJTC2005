package _03_smurf;

public class SmurfRunner {

	
	
	
	
	
	public static void main(String[]Args){
		Smurf Handy_Smurf = new Smurf("Handy Smurf");
		Handy_Smurf.eat();
		System.out.println(Handy_Smurf.getName());
		
		Smurf Papa_Smurf = new Smurf("Papa Smurf");
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Papa_Smurf.getName());
		System.out.println(Papa_Smurf.getHatColor());
		System.out.println(Papa_Smurf.isGirlOrBoy());
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
	
	
	
	
	
	
}
