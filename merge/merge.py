m = int(input())
arr0 = [int(x) for x in input().split()]  # first array
n = int(input())
arr1 = [int(x) for x in input().split()]  # second array

arr = []  # resultant array

# NOTE: infact, we don't need the resultant array, we may just print the
# elements one after another...

i = 0
j = 0

while i < m and j < n:
    # copy the smaller element from the two arrays, and shift the loop
    # variables
    if arr0[i] < arr1[j]:
        arr.append(arr0[i])
        i += 1
    else:
        arr.append(arr1[j])
        j += 1

# copy the rest of the elements
arr.extend(arr0[i:])
arr.extend(arr1[j:])

# NOTE: must follow the output format
for x in arr:
    print(x, end=" ")
print()
