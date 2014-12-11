package berger;
/**
 * Die Klasse Utility wird mit boolean Werten getestet + Array
 * @author benediktberger
 * @version 1.0
 */
public class Test2 {

	private static boolean a = true;
	private static boolean b = false;
	private static Integer[] zahlenfolge = {2,3,4,5,6};
	
	public static void main(String[] args){
		System.out.println("RAN: "+Utility.random(a,b));
		System.out.println("MAX: "+Utility.max(a,b));
		System.out.println("MIN: "+Utility.min(a,b));
		System.out.println("EQU: "+Utility.equalTo(a,b));
		System.out.println("\nArray: ");
		System.out.println("RAN: "+Utility.random(zahlenfolge));
		System.out.println("ARR: "+Utility.min(zahlenfolge));
		System.out.println("ARR: "+Utility.max(zahlenfolge));
	}
}
