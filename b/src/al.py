# coding=gbk
import math
a=int(input("请输入边长a:"))
b=int(input("请输入边长b:"))
c=int(input("请输入边长c:"))
if(a>0 and b>0 and c>0 and a+b>c and b+c>a and a+c>b):
    p=(a+b+c)/2
area=math.sqrt(p*(p-a)*(p-b)*(p-c))
perimeter=a+b+c
height_a=2*area/a 
max_side=max(a,b,c)
min_side=min(a,b,c)
print 'area=',area
print 'perimeter=',perimeter
print 'height_a=',height_a

