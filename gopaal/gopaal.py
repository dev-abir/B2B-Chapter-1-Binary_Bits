t = int(input())  # no. of test cases

for _ in range(t):
    x, y = [int(z) for z in input().split()]

    # either truck driver must turn, or Gopaal must turn...
    if x <= 30 or y <= 20:
        # bach gyaa
        print(0)
    else:
        # RIP Gopaal
        print(1)
