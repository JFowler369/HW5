/**
 * Represents Basic Sith for Battlefront simulation
 * @author Jesse Fowler
 * @version 1.0
 */
public class Sith extends Soldier implements ForceSensitive {

    private double power;
    private boolean hasUsedForce = false;

    /**
     * Constructs a Sith with a given
     * health, attack, defense, and identfier. And calculates power.
     *
     * @param health The health value this Soldier should begin with.
     *               Starting health must be at least 30.0 and up to 100.0
     * @param attack The attack value this Soldier should begin with.
                     Attack is bounded by [0.0, 100.0];
     * @param defense The defense value this Soldier should begin with.
                      Defense is bounded by [0.0, 100.0];
     * @param identifier The identifier of this Soldier.
     */
    public Sith(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
        this.power = (attack + defense) / 6;
    }

    /**
      * Decides if Soldier attacks given target
      * and resets bonuses from using the force.
      * @param target Target Soldier
      * @return Damage Dealt
      */
    public double attack(Soldier target) {
        target.hurt(this.getAttack());
        if (hasUsedForce) {
            this.changeAttack(-1 * power);
        }
        this.hasUsedForce = false;
        return this.getAttack();
    }

    /**
      * Increases Attack and damages Sith based on Power level
      */
    public void useTheForce() {
        this.hurt(power / 10);
        this.changeAttack(power);
        this.hasUsedForce = true;
    }

    /**
      * Custome Name return for Sith
      * @return Rebel Name String
      */
    @Override
    public String getName() {
        return "Sith " + this.getIdentifier();
    }

}
