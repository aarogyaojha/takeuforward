# write-a-program-that-takes-a-character-as-input-and-prints-1-0-or-1-according-to-the-following-rules
# 1 i char is uppercase(A-Z),0 if char is lowercase(a-z),-1 if it is not a char

## Read input as specified in the question.
## Print output as specified in the question.
inp=input()
if(inp.islower()):
    print("0")
elif(inp.isupper()):
    print("1")
else:
    print("-1")
