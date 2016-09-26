l=[]
for i in range(3):
    for j in range(3):
        l.append(int(raw_input('input a number:')))
s=0
for i in range(3):
    s+=l[3+i+i]
print s