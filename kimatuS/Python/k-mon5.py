'''
問題１ ファイル名　k-mon5
'''
#整数値を受け取る
def kan5_fun(n,x):
  return n+x,n*x


# メイン処理
k=int(input('整数値1を入力してください->'))
v=int(input('整数値2を入力してください->'))
G,D=kan5_fun(k,v)
print('足した値',G,'掛けた値',D)    
   
