# coding=gbk

def getValue(b,r,n):
    v=b*((1+r)**n)
    return round(v,2)
b=input("�����뱾��")
r=input("�����������ʣ�")
n=input("��������ݣ�")
print("��������Ϊ��"),
print getValue(b, r, n)

