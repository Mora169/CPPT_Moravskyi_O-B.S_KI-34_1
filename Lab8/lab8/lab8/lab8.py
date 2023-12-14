import os
import struct
import sys
import math

def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))
        
def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result
def calculate(x):
    a = math.radians(x)
    try:
       tanX  = math.tan(a)
       ctanX = 1/tanX
       res = ctanX/tanX
    except ValueError as err:
        print("Error: invalid argument type")
        sys.exit(1)
    except ZeroDivisionError as err:
        print(f"Error has occured: {err}")
        sys.exit(2)
    else:
        return res

if __name__ == "__main__":
    data = float(input("Enter data: "))
    result = calculate(data)
    print(f"Result is: {result}")
    try:
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("Result is: {0}".format(readResBin("binRes.bin")))
        print("Result is: {0}".format(readResTxt("textRes.txt")))
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)
