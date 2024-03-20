package fd.oop.lab2.throughthewoods;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TB
 */
public class Terrain implements RouteElement {

    private final TerrainType terrainType;
    private Map<Participant,Double> participantsInTerrain = new HashMap<>();

    public Terrain(TerrainType terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public Iterable<Participant> getParticipants() {
        return participantsInTerrain.keySet();
    }

    public TerrainType getTerrainType() {
        return terrainType;
    }

    public Map<Participant, Double> getParticipantsInTerrain() {
        return participantsInTerrain;
    }

    @Override
    public void addParticipant(Participant p) {
        participantsInTerrain.put(p, 0.0);
    }

    @Override
    public void removeParticipant(Participant p) {
        participantsInTerrain.remove(p);
    }

    @Override
    public int getParticipantsCountOnRoute() {
        return participantsInTerrain.size();
    }
    
}
