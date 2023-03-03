'''
問題1
　ファイル名：fun-01
'''
TBL=[20,60,50,10,70,30,90,100,85,65]
goukei=0
heikin=0
for i in TBL:
    goukei+=i
    heikin+=1
print('合計',goukei)
print('平均',goukei/heikin)
maxx=TBL[0]
minn=TBL[0]
for i in range(len(TBL)):
    if TBL[i]>maxx:
        maxx = TBL[i]
    if TBL[i]<minn:
        minn = TBL[i]
print('最大値:',maxx,'最小値:',minn)
