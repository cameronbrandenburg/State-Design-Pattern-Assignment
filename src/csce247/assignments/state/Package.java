package csce247.assignments.state;

/**
 * A package that has some contents and changes states
 * @author Cameron Brandenburg
 */
public class Package {

	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	private String name;
	private State state;
	
	/**
	 * Parameterized constructor for Package
	 * @param contents The name of the contents of the package
	 */
	public Package(String contents) {
		this.name = contents;
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
	}
	
	/**
	 * Sets the package state to ordered
	 */
	public void order() {
		setState(orderedState);
		state.displayStatus();
		state.displayETA();
	}
	
	/**
	 * Sets the package state to in transit
	 */
	public void mail() {
		setState(inTransitState);
		state.displayStatus();
		state.displayETA();
	}
	
	/**
	 * Sets the package state to delivered
	 */
	public void received() {
		setState(deliveredState);
		state.displayStatus();
		// Not displaying displayETA method because the instructions on Dropbox
		// do not say to and the sample-output.txt show it even though there is a
		// method for it
	}
	
	/**
	 * Setter to set the state of the package
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Accessor to return the name of the package
	 * @return The name of the package
	 */
	public String getName() {
		return this.name;
	}
}
