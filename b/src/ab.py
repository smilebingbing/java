List=['b','b','d','b','c','a','a']
print "the list is:",List
if List:
    List.sort()
    last=List[-1]
    for i in range(len(List)-2,-1,-1):
        if last==List[i]:
            del List[i]
        else:
            last=List[i]
print List
l1=['b','b','d','b','c','a','a']
l2=[]
[l2.append(i) for i in l1 if not i in l2]
print l2
def fibonacci(n):
    if n==1 or n==2:
        return 1
    else:
        return fibonacci(n-1)+fibonacci(n-2)
n=raw_input()
for x in range(101):print"fizz"[x%3*4::]+"buzz"[x%5*4::] or x 
print x