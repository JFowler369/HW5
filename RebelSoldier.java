/**
 * Represents Basic RebelSoldier for Battlefront simulation
 * @author Jesse Fowler
 * @version 1.0
 */
public class RebelSoldier extends Soldier {

  /**
   * Constructs a Rebel with a given
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
    public RebelSoldier(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

    /**
      * Custome Name return for Rebel Soldiers
      * @return Rebel Name String
      */
    @Override
    public String getName() {
        return "Rebel Soldier " + this.getIdentifier();
    }

    /**
      * Decides if Soldier attacks given target
      * @param target Target Soldier
      * @return Damage Dealt
      */
    public double attack(Soldier target) {
        if (Math.random() >= 0.20) {
            target.hurt(this.getAttack());
            return this.getAttack();
        }
        return 0.0;
    }

}
