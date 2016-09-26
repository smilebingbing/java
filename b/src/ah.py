# coding=gbk
for i in(1,2,3):
    print(i,i**2,i**3)
sum_odd=0;sum_even=0
for i in range(1,101):
    if i%2==0:
        sum_even+=i
    else:
        sum_odd+=i 
print("1~100中所有偶数的和为:"),
print(sum_even)
print("1~100中所有奇数的和为:"),
print(sum_odd)
f1=1
f2=1
for i in range(1,11):
    print(str.format("{0:6}{1:6}",f1,f2))
    if i%3==0:
        print()
    f1+=f2
    f2+=f1