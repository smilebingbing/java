x=int(raw_input('x:'))
y=int(raw_input('y:'))
z=int(raw_input('z:'))
if x>y:
    t=x
    x=y 
    y=t 
if x>z:
    t=x
    x=z 
    z=t 
if y>z:
    t=y 
    y=z 
    z=t 
print ('x,y,z')