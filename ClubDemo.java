import java.util.ArrayList;
/**
* Provide a demonstration of the Club and Membership
* classes.
*
* @author (your name)
* @version (a version number or a date)
*/
public class ClubDemo{
	// instance variables - replace the example below with your own
	private Club club;
	/**
	* Constructor for objects of class ClubDemo
	*/
	public ClubDemo(){
		club = new Club();
	}
	/**
	* Add some members to the club, and then
	* show how many there are.
	* Further example calls could be added if more functionality
	* is added to the Club class.
	*/
	public void demo(){
		club.join(new Membership("David", 2, 2004));
		club.join(new Membership("Michael", 1, 2004));
		System.out.println("The club has " + club.numberOfMembers() + " members.");
	}
	
	// prueba metodo joinedMonth()
	public void pruebaJoinedMonth(){
		club.join(new Membership("David", 2, 2004));
		club.join(new Membership("Michael", 1, 2004));
		club.join(new Membership("Peter", 2, 2007));
		club.join(new Membership("Ben", 4, 2004));
		System.out.println("Socios del mes 1: " + club.joinedMonth(1));
		System.out.println("Socios del mes 16: " + club.joinedMonth(16));
		System.out.println("Socios del mes 2: " + club.joinedMonth(2));
	}
	
	// prueba metodo purge()
	public ArrayList<Membership> pruebaPurge(){
		club.join(new Membership("David", 2, 2004));
		club.join(new Membership("Michael", 9, 2004));
		club.join(new Membership("Peter", 6, 2007));
		club.join(new Membership("Ben", 4, 2004));
		club.join(new Membership("Chris", 2, 2004));
		System.out.println("Mes 2");
		ArrayList<Membership> socio = new ArrayList<Membership>(club.purge(2, 2004));
		return socio;
	}
}