from monitor import Monitor

class TouchScreen(Monitor):
    """
    A subclass of the Monitor class representing a touch screen monitor.
    """

    x = None
    y = None

    def __init__(self, types, versions, additionals, additional__devices, prices, counts, is_availables, x_position, y_position):
        """
        Initializes a TouchScreen object with the specified parameters, including x and y positions.
        """
        super(TouchScreen, self).__init__(types, versions, additionals, additional__devices, prices, counts, is_availables)
        self.x = x_position
        self.y = y_position

    def status(self):
        """
        Prints the status information of the touch screen, including inherited attributes from Monitor and x, y positions.
        """
        super().status()
        print(f"X = {self.x} Y = {self.y}")

    def get_X(self):
        """
        Returns the x position of the touch screen.
        """
        return self.x

    def get_Y(self):
        """
        Returns the y position of the touch screen.
        """
        return self.y

    def set_X(self, x):
        """
        Sets the x position of the touch screen.
        """
        self.x = x

    def set_Y(self, y):
        """
        Sets the y position of the touch screen.
        """
        self.y = y

         