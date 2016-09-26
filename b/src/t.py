def fun(i):
    if i==1:
        return 10
    return fun(i-1)+2
print fun(5)