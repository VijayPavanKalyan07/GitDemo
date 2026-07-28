package org.example;

import java.util.Comparator;

public class CarEngineSizeComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getEngineSize() - o2.getEngineSize();
    }
}
