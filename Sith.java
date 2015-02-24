public class Sith extends Soldier implements ForceSensitive {

    private double power;
    private boolean hasUsedForce = false;

    public Sith(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
        this.power = (attack + defense) / 6;
    }

    public double attack(Soldier target) {
        target.hurt(this.getAttack());
        if (hasUsedForce) {
            this.changeAttack(-1 * power);
        }
        this.hasUsedForce = false;
        return this.getAttack();
    }

    public void useTheForce() {
        this.hurt(power / 10);
        this.changeAttack(power);
        this.hasUsedForce = true;
    }

    @Override
    public String getName() {
        return "Sith " + this.getIdentifier();
    }

}
