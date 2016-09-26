def fun(i,cnt):
    if i==0:
        print 'There are %d digit in the number.'%cnt
        return
    print i%10,
    i/=10
    cnt+=1
    fun(i,cnt)
i=int(raw_input('input a number:'))
fun(i,0)
    