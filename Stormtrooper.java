public class Stormtrooper extends Soldier {

    public Stormtrooper(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

    @Override
    public String getName() {
        return "Stormtrooper " + this.getIdentifier();
    }

    public void attack(Soldier target) {
        if (Math.random() >= 0.40) {
            target.hurt(this.getAttack() * 1.25);
        }
    }

}
