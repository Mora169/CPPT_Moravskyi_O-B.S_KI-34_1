package KI304MoravskyLab2;

/**
 * The TouchScreen class is a touch screen object that can be used with a monitor.
 * It implements the TouchScreenimplement interface to control the touch screen.
 * @author  Moravsky
 * @version 1.0
 * @since version 1.0
 */

public class Touchscreen extends monitor implements TouchScreenimplement{
	
	private int Xposition; // The current position of X on the touchscreen
	private int Yposition; // The current position of Y on the touchscreen
	private boolean Work;  // Touch screen operation status
	
	/**
     * Default constructor for the TouchScreen class.
     * Sets the initial values of the X and Y positions to 0 and the touch screen state to "off".
     */
	
	public Touchscreen(){
		setYposition(0); 
		setXposition(0);
		setWork(false);
	}
	
	/**
     * A method that returns the current X value of the touchscreen position.
     *
     * @return The X value of the touchscreen position.
     */
	
	public int getXposition() {
		writeToLogFile("TouchScreen Xposition returned "+Xposition);
		return Xposition;
	}
	
	/**
     * Method that sets the X value of the touchscreen position.
     *
     * @param x The new X value of the touchscreen position.
     */
	
	public void setXposition(int x) {
		Xposition = x;
		writeToLogFile("TouchScreen Xposition is "+Xposition);
	}
	
	/**
     * A method that returns the current Y value of the touchscreen position.
     *
     * @return The Y value of the touchscreen position.
     */
	
	public int getYposition() {
		writeToLogFile("TouchScreen Yposition returned "+Yposition);
		return Yposition;
		
	}
	
	/**
     * Method that sets the Y value of the touchscreen position.
     *
     * @param x The new Y value of the touchscreen position.
     */
	
	public void setYposition(int y) {
		Yposition = y;
		writeToLogFile("TouchScreen Yposition is "+Yposition);
	}
	
	/**
     * A method that returns the operating status of the touch screen.
     *
     * @return Touch screen operation status (true - enabled, false - disabled).
     */
	
	public boolean getWork() {
		writeToLogFile("TouchScreen returned "+Work);
		return Work;
	}
	
	/**
     * A method that sets the operating status of the touch screen.
     *
     * @param work New status of touch screen operation (true - enabled, false - disabled).
     */
	
	public void setWork(boolean work) {
		Work = work;
		writeToLogFile("TouchScreen  now  is "+Work);
	}
	
	/**
     * Method to enable the touch screen.
     * Sets the operating status of the touch screen to "on".
     */
	@Override
	public void turnOnTouchScreen() {
		setWork(true);

    }
	
	@Override
	public void turnOffTouchScreen() {
		setWork(false);
    }

}
