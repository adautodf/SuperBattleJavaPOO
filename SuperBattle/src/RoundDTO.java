public class RoundDTO {
    public int life;
    public int lifeAlien;
    public String playerOficial;
    public boolean continua;

    public RoundDTO(int life, int lifeAlien, String playerOficial, boolean continua) {
        this.life = life;
        this.lifeAlien = lifeAlien;
        this.playerOficial = playerOficial;
        this.continua = continua;
    }
    public RoundDTO() {

    }
}
