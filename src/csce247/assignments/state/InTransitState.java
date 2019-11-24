package csce247.assignments.state;

/**
 * A state where the package is being mailed
 * @author Cameron Brandenburg
 *
 */
public class InTransitState implements State {

	private Package pkg;
	
	/**
	 * Parameterized constructor for InTransitState
	 * @param pkg The package of which state to change
	 */
	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}
	
	@Override
	/**
	 * Displays the status of the package
	 */
	public void displayStatus() {
		System.out.println(pkg.getName()+" is out for delivery");
	}
	
	@Override
	/**
	 * Displays the ETA of the package
	 */
	public void displayETA() {
		System.out.println(pkg.getName()+" should arrive within 5 days");
	}
}
