/**
 * Represents Custome Stormtrooper for Battlefront simulation
 * @author Jesse Fowler
 * @version 1.0
 */
public class Trooper extends Stormtrooper {

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
    public Trooper(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

}
