package csce247.assignments.state;

/**
 * A state where the package has been delivered
 * @author Cameron Brandenburg
 *
 */
public class DeliveredState implements State {

	private Package pkg;
	
	/**
	 * Parameterized constructor for DeliveredState
	 * @param pkg The package of which state to change
	 */
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}
	
	@Override
	/**
	 * Displays the status of the package
	 */
	public void displayStatus() {
		System.out.println(pkg.getName()+" is here for you");
	}
	
	@Override
	/**
	 * Displays the ETA of the package
	 * Implemented but not used because the instructions do not specify it
	 */
	public void displayETA() {
		System.out.println(pkg.getName()+" is here");
	}
}
