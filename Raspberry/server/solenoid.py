import RPi.GPIO as GPIO
GPIO.setmode(GPIO.BOARD)
def sole_ON() :
    GPIO.setup(40,GPIO.OUT)
    GPIO.output(40,True)

def sole_OFF() :
    GPIO.setup(40,GPIO.OUT)
    GPIO.output(40,False)
    
