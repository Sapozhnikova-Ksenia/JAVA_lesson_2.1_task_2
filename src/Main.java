public class Main {
    public static void main(String[] args) {
        int oldBalance = 2000;
        int newMoney = 1600;
        int bonusMoney;
        if ((newMoney) > 1000) {
            bonusMoney = newMoney / 100 ;
        } else {
            bonusMoney = (0);}
        int finalBalance = oldBalance + newMoney + bonusMoney;
        System.out.println(finalBalance);
    }
}
