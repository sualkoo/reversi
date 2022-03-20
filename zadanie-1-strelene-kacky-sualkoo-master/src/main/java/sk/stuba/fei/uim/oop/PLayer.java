package sk.stuba.fei.uim.oop;

public class PLayer {
    private String name;
    private int money;
    private int position;
    private boolean playing;
    private boolean prison;

    public Player(String name, int money, int position, boolean playing, boolean prison) {
        this.name = name;
        this.money = money;
        this.position = position;
        this.playing = playing;
        this.prison = prison;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
        if (this.position > 23)
            this.position -= 23;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMoney(int money){
        this.money = money;
        if (this.money < 0)
            setPlaying(false);
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPrison(){
        return prison;
    }

    public void setPrison(boolean prison){
        this.prison = prison;
    }
}
}
