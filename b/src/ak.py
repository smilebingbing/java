# coding=gbk
print("100~200之间不能被3整除的数为:")
j=0
for i in range(100,201):
    if(i%3==0):
        continue
    print(i),
    j+=1
    if(j%10==0):
        print ('\n') 