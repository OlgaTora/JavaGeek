package Seminar10.game.protection;

public class WithoutShield extends Shield {

    public WithoutShield() {
        super(0, 0);
    }

    public static WithoutShield getInstance() {
        return WithoutShieldHolder.HOLDER_INSTANSE;
    }

    public String toString() {
        return ("don't have protection");
    }

    public static class WithoutShieldHolder {
        public static final WithoutShield HOLDER_INSTANSE = new WithoutShield();
    }
}

