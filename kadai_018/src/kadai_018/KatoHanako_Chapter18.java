package kadai_018;

// 子クラス（加藤花子）
public class KatoHanako_Chapter18 extends Kato_Chapter18 {
   

    // 名を設定するメソッド
    public void setGivenName() {
        givenName = "花子";
    }

    // 個別の紹介を出力するメソッド
   
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}