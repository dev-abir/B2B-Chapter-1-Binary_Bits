input()

v=list(map(int,input().split(' ')))

min=99999999
for j in v:
    if(j<min):
        min=j

print("Minimum in this list is : {}".format(min))