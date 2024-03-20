package fd.oop.lab2.throughthewoods.robots;

import fd.oop.lab2.throughthewoods.Robot;
import fd.oop.lab2.throughthewoods.TaskField;
import fd.oop.lab2.throughthewoods.TerrainType;

import java.util.Random;

/**
 *
 * @author TB
 */
public class MobileRobot extends Robot {

    public MobileRobot(int serialNumber) {
        super("Mobile robot, type A", serialNumber);
    }

    @Override
    public double movementSpeed(TerrainType terrainType) {
        switch(terrainType)
        {
            case ROAD:
                communicate("Terrain detected: "+terrainType+". Maximum movement speed.");
                return randomFactors.nextDouble()*0.1 + 0.95; //From 0.95 to 1.5
            case PATH:
                communicate("Terrain detected: "+terrainType+". Moderate speed.");
                return randomFactors.nextDouble()*0.1 + 0.85; //From 0.85 to 0.95
            case HIGH_FORREST:
                communicate("Terrain detected: "+terrainType+". Unfriendly conditions.");
                return randomFactors.nextDouble()*0.1 + 0.4; //From 0.4 to 0.5
            case LOW_FOREST:
                communicate("Terrain detected: "+terrainType+". A large number of obstacles have been detected.");
                return randomFactors.nextDouble()*0.2 + 0.2; //From 0.2 to 0.4
            case SWAMP:
            default:
                communicate("Terrain detected: "+terrainType+".");
                communicate("Engines malfunction!");
                return randomFactors.nextDouble()*0.1; //From 0.0 to 0.1
        }
    }

    @Override
    public boolean solveTask(TaskField terrainTask) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber <= 5;
    }

}
