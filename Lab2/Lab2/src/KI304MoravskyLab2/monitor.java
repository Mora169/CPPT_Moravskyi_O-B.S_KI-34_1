package KI304MoravskyLab2;

/**
 * Клас monator реалізує програму варіанту №11
 * @author Moravsky 304 
 * @version 1.0
 * @since version 1.0
 */

public class monitor {

	public static void main(String[] args) {
		Lab2 monitor = new  Lab2();
		monitor.clearLogFile();
		monitor.status();
		monitor.addCount(5);
		monitor.addPrice(200);
		monitor.buy(3);
		monitor.changeType("AAADC47");
		monitor.changeVersion("DDF212");
		monitor.checkAdditional();
		monitor.changeAdditionalDevices("loudspeakers");
		monitor.turnOffAvailable();
	}

}
