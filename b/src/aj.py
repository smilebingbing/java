# coding=gbk
import math 
m=int(input("请输入一个整数:"))
k=int(math.sqrt(m))
for i in range(2,k+2):
    if m%i==0:
        break
if i==k+1:
    print(m)
    print("是素数")
else:
    print(m)
    print("是合数")