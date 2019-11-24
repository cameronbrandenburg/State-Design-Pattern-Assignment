package csce247.assignments.state;

/**
 * A state where the package has been ordered
 * @author Cameron Brandenburg
 */
public class OrderedState implements State {

	private Package pkg;
	
	/**
	 * Parameterized constructor for OrderedState
	 * @param pkg The package of which state to change
	 */
	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}
	
	@Override
	/**
	 * Displays the status of the package
	 */
	public void displayStatus() {
		System.out.println(pkg.getName()+" was ordered");
	}
	
	@Override
	/**
	 * Displays the ETA of the package
	 */
	public void displayETA() {
		System.out.println(pkg.getName()+" should arrive in 5 to 7 business days");
	}
}
