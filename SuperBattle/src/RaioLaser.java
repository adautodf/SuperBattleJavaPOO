public class RaioLaser extends Player{
    private String firstAttack;
    private String secondAttack;
    private String thirdAttack;

    @Override
    public void getNameFirstAttack() {
        firstAttack = "Optic Blast";
        System.out.println(firstAttack);
    }

    @Override
    public void getNameSecondAttack() {
        secondAttack = "Mega Optic";
        System.out.println(secondAttack);
    }

    @Override
    public void getNameThirdAttack() {
        thirdAttack = "Super Optic";
        System.out.println(thirdAttack);
    }
}
