package kadai_026;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        // じゃんけんクラスのインスタンスを作成
        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();

        // 自分の手を入力
        String myHand = jyanken.getMyChoice();

        // 対戦相手の手を乱数で選ぶ
        String opponentHand = jyanken.getRandom();

        // じゃんけんを実行
        jyanken.playGame(myHand, opponentHand);
    }
}