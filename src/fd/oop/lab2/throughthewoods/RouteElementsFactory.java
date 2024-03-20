package fd.oop.lab2.throughthewoods;

public class RouteElementsFactory {
    static public RouteElement createRouteElement(TaskField field) {
        return new TerrainTask(field);
    }

    static public RouteElement createRouteElement(TerrainType terrainType) {
        return new Terrain(terrainType);
    }

    static public RouteElement createRouteElement(String creationString) throws IllegalArgumentException {
        try {
            return new TerrainTask(TaskField.valueOf(creationString));
        } catch (IllegalArgumentException ignored) {}
        try {
            return new Terrain(TerrainType.valueOf(creationString));
        } catch (IllegalArgumentException ignored) {}
        throw new IllegalArgumentException();
    }
}
