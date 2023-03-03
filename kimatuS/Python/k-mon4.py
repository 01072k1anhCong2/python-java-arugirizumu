'''
問題１ ファイル名　k-mon4
'''
#整数値を受け取る
def kan4_fun(n,x):
    if n<x:
      return x
    else :
      return n
# メイン処理
k=int(input('整数値1を入力してください->'))
v=int(input('整数値2を入力してください->'))
G=kan4_fun(k,v);   
print('大きい値は',G)    
