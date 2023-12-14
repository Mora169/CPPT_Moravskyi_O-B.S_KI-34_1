package KI304MoravskyLab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * This class represents a monitor with various attributes and functionality.
 */
public abstract class monitor {

    private boolean additional;
    private String additional_devices;
    private String type;
    private int price;
    private int count;
    private String version;
    public boolean isavailable;


    /**
     * Default constructor initializes an object with default values.
     */
    public monitor() {
        additional = true;
        additional_devices = "mouse";
        type = "AAd27O";
        version = "0.1";
        count = 1;
        price = 100;
        isavailable = true;
    }

    /**
     * Constructor with parameters initializes an object with specified values.
     *
     * @param type             The type of the monitor.
     * @param version          The version of the monitor.
     * @param price            The price of the monitor.
     * @param count            The quantity of available monitors.
     * @param isavailable      The availability status of the monitor.
     * @param additional       Whether there are additional devices for the monitor.
     * @param additional_devices The additional devices for the monitor.
     */
    public monitor(String type, String version, int price, int count, boolean isavailable, boolean additional, String additional_devices) {
        this.additional = additional;
        this.additional_devices = additional_devices;
        this.type = type;
        this.version = version;
        this.price = price;
        this.count = count;
        this.isavailable = isavailable;
    }

    /**
     * Checks if the monitor has additional devices and logs the result.
     */
    public void checkAdditional() {
        if (!additional) {
            writeToLogFile("This monitor does not have additional devices.");
        }
        writeToLogFile("This monitor has additional devices.");
    }

    /**
     * Changes the additional devices for the monitor and logs the change.
     *
     * @param devices The new additional devices.
     */
    public void changeAdditionalDevices(String devices) {
        if (!additional) {
            writeToLogFile("This monitor does not have additional devices.");
        }
        writeToLogFile("You changed additional devices from " + additional_devices + " to " + devices);
        this.additional_devices = devices;
    }

    /**
     * Simulates a monitor purchase and logs the result.
     *
     * @param number The number of monitors to purchase.
     */
    public void buy(int number) {
        if (count < number) {
            writeToLogFile("Oops! You want to buy more than we have available.");
        }
        this.count -= number;
        writeToLogFile("You bought " + number + " monitors. Current count: " + count);
    }

    /**
     * Turns off the availability of the monitor and logs the status change.
     */
    public void turnOffAvailable() {
        this.isavailable = false;
        writeToLogFile("Monitor is now unavailable.");
    }

    /**
     * Changes the type of the monitor and logs the change.
     *
     * @param newType The new type for the monitor.
     */
    public void changeType(String newType) {
        this.type = newType;
        writeToLogFile("Type changed to: " + type);
    }

    /**
     * Changes the version of the monitor and logs the change.
     *
     * @param newVersion The new version for the monitor.
     */
    public void changeVersion(String newVersion) {
        this.version = newVersion;
        writeToLogFile("Version changed to: " + version);
    }

    /**
     * Logs the current status of the monitor.
     */
    public void status() {
        writeToLogFile("Type: " + type + "\nVersion: " + version + "\nPrice: " + price + "\nCount: " + count + "\nAvailability: " + isavailable);
    }

    /**
     * Adds a specified amount to the price of the monitor and logs the new price.
     *
     * @param prices The amount to add to the price.
     */
    public void addPrice(int prices) {
        price += prices;
        writeToLogFile("New price: " + price);
    }

    /**
     * Adds a specified amount to the count of available monitors and logs the new count.
     *
     * @param counts The amount to add to the count.
     */
    public void addCount(int counts) {
        count += counts;
        writeToLogFile("New count: " + count);
    }

    /**
     * Clears the log file.
     */
    public void clearLogFile() {
        File logFile = new File("Lab3.txt");
        try {
            PrintWriter writer = new PrintWriter(logFile);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes a message to the log file.
     *
     * @param message The message to be written to the log file.
     */
    public void writeToLogFile(String message) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(new File("Lab3.txt"), true))) {
            writer.println(message);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


