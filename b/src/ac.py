# coding=gbk
import codecs
b=input("请输入本金：")
r=input("请输入年利率：")
n=input("请输入年份：")
v=b*((1+r)**n)
print ('本金利率和为：'),
print round(v,2) 
