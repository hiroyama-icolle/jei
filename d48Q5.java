public class d48Q5 {

    public static void main(String[] args){
        int[] numbers = new int[args.length]; //引数の長さの配列を作る

        for(int i=0; i<args.length; i++){ // (28)ア：与えられた値を全て配列へ格納する
            numbers[i] = Integer.parseInt(args[i]);
        }

		//(29)ア：②配列の全体を並べ替え対象範囲とする
        for(int nextMinIndex = 0; nextMinIndex < numbers.length -1; nextMinIndex++){
            int minIndex = nextMinIndex;
            int minValue = numbers[nextMinIndex];
            for(int checkIndex = nextMinIndex + 1; checkIndex < numbers.length; checkIndex++){
                if(numbers[checkIndex] < minValue){
                    minIndex = checkIndex;
                    minValue = numbers[minIndex];
                }
            }
            //交換
            int t;
            t = numbers[nextMinIndex];
            numbers[nextMinIndex] = numbers[minIndex];
            numbers[minIndex] = t; //(31)ア：要素の入れ替え
        }
        //結果出力
        for(int n : numbers){
            System.out.print(n + " "); //(32)ア：拡張for文を使っているのでnで良い
        }
    }
}

// 難しいところもあると思いますが、このコードを参考に後の課題にも取り組んでみましょう
// アルゴリズムの問題はこの先にも出題されます
// 同じような問題にチャレンジして慣れていきましょう

