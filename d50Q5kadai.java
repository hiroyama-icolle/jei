// s23000
// ソート途中の内容も表示する基本挿入法アルゴリズム

public class d50Q5kadai {
    public static void main(String[] args){
        int[] num = new int[args.length]; // (28)エ あらかじめ配列を作成しておく

        for(int i=0; i < args.length; i++){
            num[i] = Integer.parseInt(args[i]); //(29)ウ Integer.parseIntでint型に変換
        }

        int tmp;
        for(int i = 1; i < num.length; i++){ //(30)イ 初期値の設定
            for(int j = i-1; j >= 0 && num[j] >  num[j+1]; j--){ //(31)ア 一つ前の値と比較し、小さい場合
                tmp = num[j];       // 交換している
                num[j] = num[j+1];  // 交換している
                num[j+1] = tmp;     // 交換している
            }
        }

        for(int val: num){ // (32)ウ 拡張for文を使っている
            System.out.print(val + " ");
        }
    }
}
