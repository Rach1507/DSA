
import re

#regex


def isBalanced(s):
    p = "\[\]|\(\)|\{\}"
    while re.search(p, s):
        s = re.sub(p, "", s)
    return "NO" if s else "YES"


for i in range(int(input("No of queries "))):
    print(isBalanced(input("Enter string    ")))