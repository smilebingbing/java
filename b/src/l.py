import string
def main():
    s=raw_input('enter a string:')
    letter=0
    space=0
    digit=0
    other=0
    for i in s:
        if i.isalpha():
            letter+=1
        elif i.isspace():
            space+=1
        elif i.isdigit():
            digit+=1
        else:
            other+=1
    print 'there are %d letters,%d spaces,%d digits and %d other characters in your string.'%(letter,space,digit,other)
if __name__=="__main__":
    main()    
    