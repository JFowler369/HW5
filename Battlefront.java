/**
 * Represents Basic Sith for Battlefront simulation
 * @author Jesse Fowler
 * @version 1.0
 */
public class Battlefront {

    /**
      * Runs Simulation
      * @param args No Argument
      */
    public static void main(String[] args) {

        Rebel han = new Rebel(100, 100, 100, "Han Solo");
        Trooper tk = new Trooper(100, 100, 100, "TK-422");

        System.out.println("+-------------------------------------------+");
        System.out.println("| Welcome to the Battlefront1331 Simulator! |");
        System.out.println("+-------------------------------------------+");

        System.out.println("How many Rebel Soldiers "
                           + "would you like to include?");
        String rebelString = System.console().readLine();
        int rebels = Integer.parseInt(rebelString);

        System.out.println("How many Jedi would you like to include?");
        String jediString = System.console().readLine();
        int jedi = Integer.parseInt(jediString);

        System.out.println("How many Stormtroopers would you like to include?");
        String stormString = System.console().readLine();
        int stormtroopers = Integer.parseInt(stormString);

        System.out.println("How many Sith would you like to include?");
        String sithString = System.console().readLine();
        int sith = Integer.parseInt(sithString);

        Simulation s = new Simulation(rebels, jedi, stormtroopers, sith,
                                      han, tk);

        while (s.getNumRebellionRemaining() > 0
              && s.getNumEmpireRemaining() > 0) {
            System.out.println("Press enter to begin the simulation");
            System.console().readLine();
            s.simulateSkirmish(false);
        }

        System.out.println("Simulation Complete!");

        if (s.getNumEmpireRemaining() > 0) {
            System.out.println("Empire has crushed the Rebellion");
        } else {
            System.out.println("Rebels have overwhelmed the Empire!");
        }

        int rebelsRemaining = s.getNumRebelsRemaining();
        int jediRemaining = s.getNumJediRemaining();
        int sTroopersRemaining = s.getNumTroopersRemaining();
        int sithRemaining = s.getNumSithRemaining();

        System.out.println(rebelsRemaining + " of " + rebels
                            + " Rebel Soldiers Remain");
        System.out.println(jediRemaining + " of " + jedi + " Jedi Remain");
        System.out.println(sTroopersRemaining + " of " + stormtroopers
                            + " Stormtroopers Remain");
        System.out.println(sithRemaining + " of " + sith + " Sith Remain");
    }

}
