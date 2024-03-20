package fd.oop.lab2;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import fd.oop.lab2.throughthewoods.*;
import fd.oop.lab2.throughthewoods.humans.SwampRunner;
import fd.oop.lab2.throughthewoods.robots.MobileRobot;

/**
 *
 * @author TB
 */
public class JavaLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set<Participant> participants = new HashSet<>();
        participants.add(new SwampRunner("Christopher", "Smith", Human.Gender.MAN));
        participants.add(new MobileRobot(1));
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome in Through The Woods application. Please choose run: ");
        System.out.println("1. Hills");
        System.out.println("2. Cross-country with math");
        System.out.println("3. Swamp scientific mix");
        int choice = scanner.nextInt();
        
        ThroughTheWoods run;
        
        switch(choice)
        {
            default:
                System.out.println("Unidentified choice. Fallback to option 1.");
            case 1:
                run = hills(System.out, System.out);
                break;
            case 2:
                run = crossCountryWithMath(System.out, System.out);
                break;
            case 3:
                run = swampMix(System.out, System.out);
                break;
        }
        
        for(Participant p : participants)
        {
            run.addParticipant(p);
        }
        
        run.runCompetitions();
    }
    
    private static ThroughTheWoods hills(PrintStream microphone, PrintStream spaceInTheWoods)
    {
        ThroughTheWoods hills_ = new ThroughTheWoods("Hills",microphone,spaceInTheWoods);
        
        hills_.addRouteElement(new Terrain(TerrainType.ROAD));
        hills_.addRouteElement(new Terrain(TerrainType.PATH));
        hills_.addRouteElement(new Terrain(TerrainType.PATH));
        hills_.addRouteElement(new Terrain(TerrainType.LOW_FOREST));
        hills_.addRouteElement(new Terrain(TerrainType.SWAMP));
//        hills_.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.PHYSICS));
//        hills_.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.MATHEMATICS));
//        hills_.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.FORESTRY_SCIENCES));
        hills_.addRouteElement(new Terrain(TerrainType.HIGH_FORREST));
        
        return hills_;
    }

    private static ThroughTheWoods crossCountryWithMath(PrintStream microphone, PrintStream spaceInTheWoods) {
        ThroughTheWoods crossCountry = new ThroughTheWoods("Cross-country with math",microphone,spaceInTheWoods);
        
        crossCountry.addRouteElement(RouteElementsFactory.createRouteElement(TerrainType.ROAD));
        crossCountry.addRouteElement(RouteElementsFactory.createRouteElement(TaskField.MATH));
        crossCountry.addRouteElement(new Terrain(TerrainType.PATH));
        crossCountry.addRouteElement(new Terrain(TerrainType.LOW_FOREST));
        crossCountry.addRouteElement(new Terrain(TerrainType.LOW_FOREST));
//        crossCountry.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.MATHEMATICS));
        crossCountry.addRouteElement(new Terrain(TerrainType.LOW_FOREST));
//        crossCountry.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.MATHEMATICS));
        crossCountry.addRouteElement(new Terrain(TerrainType.HIGH_FORREST));
        
        return crossCountry;
    }

    private static ThroughTheWoods swampMix(PrintStream microphone, PrintStream spaceInTheWoods) {
        ThroughTheWoods mix = new ThroughTheWoods("Swamp scientific mix",microphone,spaceInTheWoods);
        
        mix.addRouteElement(new Terrain(TerrainType.ROAD));
        mix.addRouteElement(new Terrain(TerrainType.PATH));
        mix.addRouteElement(new Terrain(TerrainType.SWAMP));
//        mix.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.MATHEMATICS));
        mix.addRouteElement(new Terrain(TerrainType.SWAMP));
//        mix.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.PHYSICS));
        mix.addRouteElement(new Terrain(TerrainType.SWAMP));
//        mix.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.COMPUTER_SCIENCE));
        mix.addRouteElement(new Terrain(TerrainType.SWAMP));
//        mix.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.ART));
        mix.addRouteElement(new Terrain(TerrainType.SWAMP));
//        mix.addRouteElement(RouteElementsFactory.createRouteElement(FieldOfTheTask.FORESTRY_SCIENCES));
        mix.addRouteElement(new Terrain(TerrainType.HIGH_FORREST));
        
        return mix;
    }
    
}
