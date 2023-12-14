from TouchScreen import TouchScreen
from monitor import Monitor

def main():
    """
    The main function demonstrating the usage of Monitor and TouchScreen classes.
    """
    # Create a Monitor object
    monitor = Monitor("FN234", "1")

    # Create a TouchScreen object
    ts = TouchScreen("FN234s", "2", "mouse", True, 250, 6, True, 12, 2)

    # Set the x position of the TouchScreen class (static variable)
    TouchScreen.x = 26
    # Change the type of the Monitor object
    ts.change_type("Type №2")
    ts.turn_off_available();
    # Check if the Monitor has additional devices
    monitor.check_additional()

    # Change the additional devices of the Monitor
    monitor.change_additional_devices("keyboard")

    # Buy 2 monitors and update the count
    monitor.buy(2)

    # Turn off the availability of the Monitor
    monitor.turn_off_available()

    # Change the type of the Monitor
    monitor.change_type("Type №3")

    # Change the version of the Monitor
    monitor.change_version("1.1")

    # Print the status of the Monitor
    monitor.status()

    # Add 50 to the price of the Monitor
    monitor.add_price(50)

    # Add 5 to the count of the Monitor
    monitor.add_count(9)

    # Print the status of the TouchScreen
    ts.status()

    # Clear the content of the log file
    monitor.clear_log_file()

    # Write an empty message to the log file
    monitor.write_to_log_file("Lab9")

if __name__ == "__main__":
    main()
