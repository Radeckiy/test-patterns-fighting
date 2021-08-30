package model.weapon;

public class Weapon {
    private String skin;
    private String animation;

    public Weapon(String skin, String animation) {
        this.skin = skin;
        this.animation = animation;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation;
    }

    @Override
    public String toString() {
        return "{ Скин: " + skin + "; Анимация: " + animation + " }";
    }
}
