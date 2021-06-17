public class Main {
    public static void main(String[] args) {
        int oldBalance = 2000_00;
        int newMoney = 1600_00;
        int bonusMoney;
        if ((newMoney) > 1000_00) {
            bonusMoney = newMoney / 100 ;
        } else {
            bonusMoney = (0);}
        int finalBalance = oldBalance + newMoney + bonusMoney;
        System.out.println(finalBalance);
    }
}
