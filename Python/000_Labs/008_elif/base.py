int1 = int(input("Please enter a number: "))
text1 = input("Please enter an operation: " )
int2 = int(input("Please enter another number: "))

if text1 == "+":
    print(str(int1) + str(text1) + str(int2) + "=" + str(int1 + int2))
elif text1 == "-":
    print(str(int1) + str(text1) + str(int2) + "=" + str(int1 - int2))
elif text1 == "*":
    print(str(int1) + str(text1) + str(int2) + "=" + str(int1 * int2))
elif text1 == "/":
    print(str(int1) + str(text1) + str(int2) + "=" + str(int1 / int2))
else :
    print( text1 + " isnt a operation")


