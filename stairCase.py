
n = int (input ("n = "))            # get size

for i in range (n):
    for j in range (1, n-i):
        print (" ", end="")

    for k in range (i+1):
        print ("#", end="")

    print ()