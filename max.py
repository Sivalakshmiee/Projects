#Finding the maximum numbers

a = int(input("Enter a number1:"))
b = int(input("Enter a number2:"))
def maximum(a, b):
    if a >= b:
        return a
    else:
        return b
    
print(max(a,b))
    
