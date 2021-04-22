# number palindrome

n = 123321

def palindrome(num):
    rev_num = 0
    while num>0:
        rem = num % 10
        rev_num= rev_num*10+rem
        num=num//10
    return rev_num


if n == palindrome(n):
    print(n ,' is Palindrome')
else:
    print('Sorry!', n, 'is Not a palindrome')




# using math.log() + recursion + list comprehension 
import math 
   

def rev(num): 
    return int(num != 0) and ((num % 10) * (10**int(math.log(num, 10))) + rev(num // 10)) 


if n == palindrome(n):
    print(n ,' is Palindrome')
else:
    print('Sorry!', n, 'is Not a palindrome')



# using str() + string slicing 
# for checking a number is palindrome 

n = 123321

res = str(n) == str(n)[::-1] 

print ("Is the number palindrome ? : " + str(res))  #Is the number palindrome ? : True 


#  read input as string and then simply check for palindrome.

n = '123321'
if n == n[::-1]: 
    print("Yes its a palindrome") 
else: 
    print("No, its not a palindrome")
    # Yes its a palindrome