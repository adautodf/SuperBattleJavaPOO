public class MuqueMan extends Player{
    private String firstAttack;
    private String secondAttack;
    private String thirdAttack;

    @Override
    public void getNameFirstAttack() {
        firstAttack = "Chute";
        System.out.println(firstAttack);
    }

    @Override
    public void getNameSecondAttack() {
        secondAttack = "Tornado";
        System.out.println(secondAttack);
    }

    @Override
    public void getNameThirdAttack() {
        thirdAttack = "Berserker";
        System.out.println(thirdAttack);
    }
}
