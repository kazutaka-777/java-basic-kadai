package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    // じゃんけんの手を保持するHashMap
    private HashMap<String, String> handMap = new HashMap<>();

    // コンストラクタ
    public Jyanken_Chapter26() {
        // HashMapにじゃんけんの手を追加
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
    	while(true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.nextLine();
        if(input.equals("r")||input.equals("s")||input.equals("p")){
        	scanner.close();
        	return input;
        }else {
        	 System.out.println("正しい手を入力してください");
        	 continue;
        }
        }
       
       
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶメソッド
    public String getRandom() {
        // 0から2の乱数を生成
        double randomNum = Math.floor(Math.random() * 3);
        String[] hands = {"r", "s", "p"};
        return hands[(int) randomNum];
    }

    // じゃんけんを行うメソッド
    public void playGame(String myHand, String opponentHand) {
        // 自分と対戦相手の手を出力
        System.out.println("自分の手は" + handMap.get(myHand) + ", 対戦相手の手は" + handMap.get(opponentHand));

        // じゃんけんの結果を判定
        if (myHand.equals(opponentHand)) {
            System.out.println("あいこです");
        } else if ((myHand.equals("r") && opponentHand.equals("s")) ||
                   (myHand.equals("s") && opponentHand.equals("p")) ||
                   (myHand.equals("p") && opponentHand.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}