public class Jedi extends Soldier implements ForceSensitive {

    private double power;
    private boolean hasUsedForce = false;

    public Jedi(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
        this.power = defense / 4;
    }

    public double attack(Soldier target) {
        target.hurt(this.getAttack());
        if (hasUsedForce) {
            this.changeDefense(-1 * power);
        }
        this.hasUsedForce = false;
        return this.getAttack();
    }

    public void useTheForce() {
        this.heal(power / 4);
        this.changeDefense(power);
        this.hasUsedForce = true;
    }

    @Override
    public String getName() {
        return "Jedi " + this.getIdentifier();
    }

}
