package data;

import java.util.HashMap;
import java.util.Map;

public class PlayerStats {
    Map<StatsType, Integer> dataMap;

    public PlayerStats() {
        this.dataMap = new HashMap<>();
    }
    public Integer getStatsByType(StatsType type) {
        return (dataMap.get(type) == null) ? -1 : dataMap.get(type);
    }
    public boolean increaseStatsByType(StatsType type) {
        dataMap.replace(type, dataMap.put(type, dataMap.get(type) + 1));
        return true;
    }
}
