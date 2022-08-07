v=['a','e','i','o','u']
cd="bcdfghjklmnpqrstvwxyz"
ch=input()
c=0
d=0
for i in ch:
    if(i in v):
        c=c+1
    elif(i in cd):
        d=d+1
print("Ratio is {} : {}".format(c,d))