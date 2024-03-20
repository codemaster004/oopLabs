package fd.oop.lab2.throughthewoods;

import java.io.PrintStream;

/**
 *
 * @author TB
 */
public interface Participant {
    
    /**
     * This method sets data stream to which particpant say.
     * @param ps data stream
     */
    void sayTo(PrintStream ps);
    
    /**
     * This method return information about speed with which participant
     * move within specified terrain. Result may be different after each run.
     * @param terrainType terrain type
     * @return value betweent 0 and 1
     */
    double movementSpeed(TerrainType terrainType);

    boolean solveTask(TaskField terrainTask);
}
