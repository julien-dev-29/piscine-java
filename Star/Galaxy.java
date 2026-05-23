package Star;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private final List<CelestialObject> celestialObjects;

    public Galaxy() {
        celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        celestialObjects.add(celestialObject);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Planet", 0);
        map.put("Star", 0);
        map.put("Other", 0);
        for (CelestialObject celestialObject : celestialObjects) {
            if (celestialObject instanceof Planet) {
                map.put("Planet", map.get("Planet") + celestialObject.getMass());
            } else if (celestialObject instanceof Star) {
                map.put("Star", map.get("Star") + map.get("Star") + celestialObject.getMass());
            } else {
                map.put("Other", map.get("Other") + celestialObject.getMass());
            }
        }
        return map;
    }
}