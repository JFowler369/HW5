/**
 * Represents Basic Stormtrooper for Battlefront simulation
 * @author Jesse Fowler
 * @version 1.0
 */
public class Stormtrooper extends Soldier {

  /**
   * Constructs a Stormtrooper with a given
   * health, attack, defense, and identfier.
   *
   * @param health The health value this Soldier should begin with.
   *               Starting health must be at least 30.0 and up to 100.0
   * @param attack The attack value this Soldier should begin with.
                   Attack is bounded by [0.0, 100.0];
   * @param defense The defense value this Soldier should begin with.
                    Defense is bounded by [0.0, 100.0];
   * @param identifier The identifier of this Soldier.
   */
    public Stormtrooper(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

    /**
      * Custome Name return for Stormtrooper
      * @return Rebel Name String
      */
    @Override
    public String getName() {
        return "Stormtrooper " + this.getIdentifier();
    }

    /**
      * Decides if Soldier attacks given target and applies damage bonus
      * @param target Target Soldier
      * @return Damage Dealt
      */
    public double attack(Soldier target) {
        if (Math.random() >= 0.40) {
            target.hurt(this.getAttack() * 1.25);
            return this.getAttack() * 1.25;
        }
        return 0.0;
    }

}
