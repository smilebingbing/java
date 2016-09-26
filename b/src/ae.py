# coding=gbk

def getValue(b,r,n):
    v=b*((1+r)**n)
    return round(v,2)
b=input("请输入本金：")
r=input("请输入年利率：")
n=input("请输入年份：")
print("最终收益为："),
print getValue(b, r, n)

