import csv
import pandas as pd
import numpy as np
z=input('read(r) and write or append (a)\nenter:')
k=['date','invested','current value','day change',"per change",'nifty','day change','nifty per change']
# with open('E:\my folder/portfolio.csv','w') as f:       'portfolio vs nifty'
#     ff=csv.writer(f)
#     ff.writerow(k)
if z=='a':
    with open('E:\my folder/portfolio.csv','a') as f:
        ff=csv.writer(f)
        #ff.writerow(k)
        q=[]
        for i in k:
            a=input(f'enter {i} :')
            q.append(a)
        b=float(q[4])-float(q[7])
        bb=round(b,2)
        q.append(bb)
        print(q)
        
        ff.writerow(q)
elif z=='r':
    z1=input('if read all type "r"\nread specific date type "d"\nenter:-')
    with open('E:\my folder/portfolio.csv','r') as f:
        fr=csv.reader(f)
        l=[]
        for i in fr:
            l.append(i)
        r=pd.DataFrame(l)
        if z1=='r':
            print(r)
        elif z1=='d':
            z2=input('enter date saperated by "/" (ex. 01/01/2022) \n:-')
            i1=0
            k=['date','invested','current value','day change',"per change",'nifty','day change','nifty per change','nifty vs portfolio']
            #if z2 in (r.loc[:,0]):
            for i in (r.loc[:,0]):
                if i==z2:
                    r1=pd.Series(k,index=r.loc[i1,:])
                    zz2=r.loc[i1,:]
                    for i in range (0,len(k)):
                        print(f'{k[i]} = {zz2[i]}')
                else:
                    i1=i1+1
else:
    print('wrong input')