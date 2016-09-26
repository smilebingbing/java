i=int(raw_input('Enter the profit:'))
r=0
L=[1000000,600000,400000,200000,100000,0]
rate=[0.01,0.015,0.03,0.05,0.075,0.1]
for idx in range(0,6):
    if i>L[idx]:
        r+=(i-L[idx])*rate[idx]
        print (i-L[idx])*rate[idx]
    i=L[idx]
print r
    
