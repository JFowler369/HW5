public class Stormtrooper extends Soldier {

    @override
    public String getName() {
        return "Stormtrooper " + this.getIdentifier();
    }

    public double attack(Soldier target) {
        if (math.random(100) >= 40) {
            target.hurt(this.getAttack() * 1.25)
        }
    }

}
