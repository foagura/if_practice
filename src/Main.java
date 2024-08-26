//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        int value = 0;

        if (value > 0){
            System.out.println("valueの方が大きいです");
        }else if (value < 0){
            System.out.println("valueの方が小さいです");
        }else if (value == 0){
            System.out.println("valueは0です");
        }else {
            System.out.println("エラー");
        }
    }
}