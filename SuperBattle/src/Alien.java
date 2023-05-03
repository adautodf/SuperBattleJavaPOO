public class Alien extends Player{
    private String name;
    private String firstAttack;
    private String secondAttack;
    private String thirdAttack;

    @Override
    public void getNameFirstAttack() {
        firstAttack = "Split Kick";
        System.out.println(firstAttack);
    }

    @Override
    public void getNameSecondAttack() {
        secondAttack = "Bit Laser";
        System.out.println(secondAttack);
    }

    @Override
    public void getNameThirdAttack() {
        thirdAttack = "Shockwave";
        System.out.println(thirdAttack);
    }
}
