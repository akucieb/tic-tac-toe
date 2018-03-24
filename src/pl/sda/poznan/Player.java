package pl.sda.poznan;

public class Player {
    private char sign;
    private String name;
    private Player opponent;

    public Player(String name, char sign) {
        this.sign = sign;
        this.name = name;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getOpponent() {
        return opponent;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    @Override
    public String toString() {
        return this.name + " " + this.sign;
    }
}
