package csce247.assignments.state;

/**
 * Interface for the different states of a package
 * @author Cameron Brandenburg
 */
public interface State {

	/**
	 * Displays the status of the package
	 */
	public void displayStatus();
	
	/**
	 * Displays the ETA of the package
	 */
	public void displayETA();
}
