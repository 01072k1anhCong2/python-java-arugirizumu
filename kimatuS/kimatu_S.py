'''
メインファイル名:kimatu_S.py
sampleフォルダ内に保存するクラスファイル
クラス定義ファイル名:my_class.py

'''
from sample.my_class import karute
#メイン
#クラス配列のデータリストを定義
animal_list=[]
sw=0
#処理番号を入力
while sw==0:
    process_no=int(input('新規登録:1,ワクチン接種:2,全てを表示:3,ワクチン接種済の表示:4,ワクチン接種無の表示:5 =>'))
    #新規登録
    if process_no==2:
        no=int(input('登録番号入力=>'))
        tuki=int(input('ワクチン接種月=>'))
        for add in animal_list:
            if add.p_no==no:
                #print('番号一致')
                add.wakutin_entry(tuki)
                break
        #print('変更終了')
    #ワクチン接種登録
    elif process_no==1:
        print("--------登録-------")
        k_name=input("飼い主の氏名を入力=>")
        k_pname=input("ペットの名前を入力=>")
        k_type=int(input('ペットの種類 (1:犬・2:猫・3:ペレット・4:ハムスター・5:その他)の番号:'))
        addres=karute(k_name,k_pname,k_type)
        animal_list.append(addres)
        print('登録番号',karute.karute_no)
    #表示
    elif process_no==3:
        for add in animal_list :
            add.print_stu()
    elif process_no==4:
        for add in animal_list:
            add.wakutin_count()
        print('******ワクチン接種済の数******')
        print('ワクチン接種済の数=',karute.w_count)
        #karute.w_count = 0

    else:#終了
        print('プログラム終了')
        sw=1
        
       
