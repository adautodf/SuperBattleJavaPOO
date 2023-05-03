public class Relampago extends Player{
    private String firstAttack;
    private String secondAttack;
    private String thirdAttack;

    @Override
    public void getNameFirstAttack() {
        firstAttack = "Lightning Attack";
        System.out.println(firstAttack);
    }

    @Override
    public void getNameSecondAttack() {
        secondAttack = "Lightning Storm";
        System.out.println(secondAttack);
    }

    @Override
    public void getNameThirdAttack() {
        thirdAttack = "Hail Storm";
        System.out.println(thirdAttack);
    }
}
