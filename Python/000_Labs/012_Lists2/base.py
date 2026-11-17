import random
thislist = []
x = int(input("How many random numbers would you like? "))

print("Your numbers are:", end=" ")
for i in range(x):
    thislist.append(random.randint(1,10))
    

    if i == x - 1:
        print(thislist[i])
    else:
        print(thislist[i], end=", ")

    






