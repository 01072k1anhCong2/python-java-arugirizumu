'''
問題2
   ファイル名：fun-02
'''
a=int(input('人数を入力＝'))
goukei=0
heikin=0
saikou=0
saitei=10000000
for b in range(a):
        b=int(input('ゲームの点数を入力＝'))
        goukei+=b
        heikin+=1
        if b>saikou:
          saikou=b
        if b<saitei:
           saitei=b
print('合計値',goukei)
print('平均値',goukei/heikin)
print('最高点',saikou)
print('最低点',saitei)
