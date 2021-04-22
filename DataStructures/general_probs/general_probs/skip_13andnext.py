# Given an array calculate the sum except when there is a 13 in the array. 
# If there is a 13 in the array, skip the 13 and the number immediately following it.
#  For example [1,2,13,5,1] should yield 4
# One tricky thing to notice is something like this: [1, 13, 13, 2, 3]
# You need to skip 2 too


# items = [1,2,3,4,13,6,13,7]

# def getSum(items):
#     sum = 0
#     skip = False
#     for i in items:
#          if i == 13:
#              skip = True
#              continue
#          if skip:
#              skip = False
#              continue
#          sum += i
#     return sum



# sum=getSum(items)
# print(sum)
