i=1
e=1
t=1
while(1/t>=pow(10, -6)):
    t=t*i
    e=e+1/t 
    i+=1
print("e="),
print round(e,15)
for i in range(1,10):
    for j in range(1,i+1):
        print i,'*',j,'=',i*j," ",
    print '\n'
print '\n'
for i in range(1,10):
    for j in range(1,10):
        print i,'*',j,'=',i*j," ",
    print '\n'
print '\n'
for i in range(1,10):
    for j in range(1,i+1):
        print j,'*',i,'=',j*i," ",
    print '\n'
