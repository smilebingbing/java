l=[0,10,20,30,40,50]
print 'the sorted list is:',l 
cnt=len(l)
n=int(raw_input('input a number:'))
l.append(n)
for i in range(cnt):
    if n<l[i]:
        for j in range(cnt,i,-1):
            l[j]=l[j-1]
        l[i]=n
        break
print 'the new sorted list is:',l 