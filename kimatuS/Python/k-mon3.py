'''
問題１ ファイル名　k-mon3
'''
#整数値を受け取る
def kan3_fun(n,x):
  if n<x:
      print(x,'は',n,'より大きいです')
  elif n>x:
    print(x,'は',n,'より小さいです')
  else:
      print(n,'は',x,'同じです')
# メイン処理
k=int(input('整数値1を入力してください->'))
v=int(input('整数値2を入力してください->'))
kan3_fun(k,v);   
    
