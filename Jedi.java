/**
 * Represents Basic Jedi for Battlefront simulation
 * @author Jesse Fowler
 * @version 1.0
 */
public class Jedi extends Soldier implements ForceSensitive {

    private double power;
    private boolean hasUsedForce = false;

    /**
     * Constructs a Jedi with a given
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
    public Jedi(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
        this.power = defense / 4;
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
            this.changeDefense(-1 * power);
        }
        this.hasUsedForce = false;
        return this.getAttack();
    }

    /**
      * Increases Defense and heals Jedi based on Power level
      */
    public void useTheForce() {
        this.heal(power / 4);
        this.changeDefense(power);
        this.hasUsedForce = true;
    }

    /**
      * Custome Name return for Jedi
      * @return Rebel Name String
      */
    @Override
    public String getName() {
        return "Jedi " + this.getIdentifier();
    }

}
