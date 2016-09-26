print 'input 10 numbers please:'
l=[]
for i in range(10):
    l.append(int(raw_input('input a number:')))
for i in range(9):
    for j in range(i+1,10):
        if l[j]<l[i]:
            temp=l[j]
            l[j]=l[i]
            l[i]=temp
print l 
            
        
    