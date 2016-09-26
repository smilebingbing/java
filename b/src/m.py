def main():
    basis=int(raw_input('enter a basis number:'))
    n=int(raw_input('enter a longest number:'))
    b=basis
    sum=0
    for i in range(0,n):
        if i==n-1:
            print '%d' %(basis),
        else:
            print '%d +'%(basis),
        sum+=basis
        basis=basis*10+b
    print '=%d '%(sum),
if __name__=="__main__":
    main()
        