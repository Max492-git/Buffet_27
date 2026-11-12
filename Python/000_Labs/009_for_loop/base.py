x = int(input("Please enter line length: "))
y = input("Do you want a horizontal or vertical line? ")

if y == "vertical":
    for z in range(0,x):
        print("*")
elif y == "horizontal":
    for z in range(0,x):
        print("*" , end = " ")
else:
    print("Try again")

