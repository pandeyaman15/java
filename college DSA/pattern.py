for i in range(7):
    for j in range(7):
        if( i+j>=3 and (j<4 and i<4) or j-i<=3 and  (j>3 and i<4) or i-j <=3 and(i>3 and j<4)or i+j<=9 and(j>3 and i>3)):
            print("*",end="")
        else:
            print(" ",end="")
    print()
print("###############################################")

z='z'
for i in range(65,91):
    print(chr(i), end="")
    
    
print("\n###############################################")
#n=int(input("Enter number"))

for i in range(15):
    for j in range(15):
        if(j==0 or i+j<=7  or i-j >=7):
            print("*", end="")
            
        else:
            print(" ", end="")
    print("")        
    
    
    
print("\n###############################################")


for i in range(15):
    A=4
    B=1
    for j in range(15):
        if(i+j>=3 and (i<4 and j<4)):
            print(A, end="")
          
        else:
            print(" ", end="")
        if(i<4):
            A+=1
        else:
            A-=1
    print("")        
    