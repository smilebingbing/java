def main():
    s = int(raw_input('Enter a number:'))
    if s>=90:
        grade = 'A'
    elif s>=60:
        grade = 'B'
    else:
        grade = 'C'
    print grade,

if __name__ == '__main__':
    main()