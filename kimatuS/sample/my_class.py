'''
メインファイル名:kimatu_S.py
sampleフォルダ内に保存するクラスファイル
クラス定義ファイル名:my_class.py

'''
#クラス定義
class karute:
    #クラス変数
    karute_no = 2000 #カルテ番号(初期化)
    w_count=0
    #会員番号の登録を連番で行う
    @classmethod
    def kain_method(cls):
        karute.karute_no+=1
        return cls.karute_no

     #初期化
    def __init__(self, register,in_name,in_type):
        self.p_no=karute.kain_method()
        self.name=register
        self.p_name=in_name
        self.p_type=in_type
        self.p_wakutin=0
        self.p_tuki=0

    #カルテの全てを表示
    def print_stu(self):
        #ペットの種類を文字表示
        if self.p_type==1:
            moji='犬'
        if self.p_type==2:
            moji='猫'
        if self.p_type==3:
            moji='ペレット'
        if self.p_type==4:
            moji='ハムスター'
        else:
            moji='その他'
        #ワクチン接種の有無表示
        if self.p_wakutin==0:
            moji2='種類無'
        else:
            moji2='種類済'

        print("-------会員情報-------")
        print("会員番号:",self.p_no)
        print("飼い主:",self.name)
        print("ペット名:",self.p_name)
        print("ペットの種類:",moji)
        print("予防接種:",moji2)
        print("ワクチン接種済の月:",self.p_tuki,'月')

    #ワクチン接種メソッド
    def wakutin_entry(self,in_tuki):
        self.p_wakutin=1
        self.p_tuki=in_tuki
    #ワクチン接種済の数メソッド
    def wakutin_count(self):
        if self.p_wakutin==1:
            karute.w_count+=1
            self.print_stu()
