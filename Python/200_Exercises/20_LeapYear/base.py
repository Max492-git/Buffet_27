int1 = int(input("Please enter a year you'd like to check! "))

if (int1 % 4 == 0 and int1 % 100 != 0) or (int1 % 400 == 0):
    print("The year "+str(int1)+" is a leap year")
else:
    print("The year "+str(int1)+" is not a leap year")
