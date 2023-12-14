package KI304MoravskyLab2;

/**
 * monitor Application class implements main method for TouchScreenimplement
 class possibilities demonstration
 *
 * @author Moravsky
 * @version 1.0
 * @since version 1.0
 */
public class app {

	public static void main(String[] args) {
		Touchscreen monitor = new Touchscreen();
		monitor.clearLogFile();
		monitor.status();
		monitor.addCount(5);
		monitor.addPrice(200);
		monitor.buy(3);
		monitor.changeType("wdsf12");
		monitor.changeVersion("TSJ1");
		monitor.checkAdditional();
		monitor.changeAdditionalDevices("keyboard");
		monitor.turnOffTouchScreen();
	}

}
