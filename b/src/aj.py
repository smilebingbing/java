# coding=gbk
import math 
m=int(input("������һ������:"))
k=int(math.sqrt(m))
for i in range(2,k+2):
    if m%i==0:
        break
if i==k+1:
    print(m)
    print("������")
else:
    print(m)
    print("�Ǻ���")