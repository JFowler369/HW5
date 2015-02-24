public class RebelSoldier extends Soldier {

    public RebelSoldier(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

    @Override
    public String getName() {
        return "Rebel Soldier " + this.getIdentifier();
    }

    public double attack(Soldier target) {
        if (Math.random() >= 0.20) {
            target.hurt(this.getAttack());
            return this.getAttack();
        }
        return 0.0;
    }

}
