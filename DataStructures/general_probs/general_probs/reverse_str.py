def reverse_str(str_given):
    rev_str = ''
    for chara in str_given:
        rev_str = chara +rev_str  # appending chars in reverse order
    return rev_str


input_str = 'ABç∂EF'
print('Reverse String using for loop =', reverse_str(input_str))



def reverse(string): 
    string = string[::-1] 
    return string 
  
s = "Geeksforgeeks"
  
print ("The original string  is : ",end="") 
print (s) 
  
print ("The reversed string(using extended slice syntax) is : ",end="") 
print (reverse(s)) 


# Python code to reverse a string  
# using loop 
  
def reverse(s): 
  str = "" 
  for i in s: 
    str = i + str
  return str
  
s = "Geeksforgeeks"
  
print ("The original string  is : ",end="") 
print (s) 
  
print ("The reversed string(using loops) is : ",end="") 
print (reverse(s)) 



li = list("hello")
stri =""
print(stri.join(li[2:]) + str(li[1]) +str(li[0]))