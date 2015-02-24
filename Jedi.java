abstract class Jedi extends Soldier implements ForceSensitive {

  public Jedi(double health, double attack,
          double defense, String identifier) {
      super(health, attack, defense, identifier);
  }

}
