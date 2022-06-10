package control;

import java.util.ArrayList;

import model.FactorySensor;
import model.Sensor;

public class SensorControl {

    private ArrayList<Sensor> sensors;

    public SensorControl() {
        sensors = new ArrayList<Sensor>();
    }

    public boolean buildSensor(String InitialDelayStr, String ProductionIntervalStr, String ProductionQuantityStr,
            String DelayVariationStr, String StopsQuantityStr, String type) {
        int InitialDelay = isNumeric(InitialDelayStr);
        int ProductionInterval = isNumeric(ProductionIntervalStr);
        int ProductionQuantity = isNumeric(ProductionQuantityStr);
        int DelayVariation = isNumeric(DelayVariationStr);
        int StopsQuantity = isNumeric(StopsQuantityStr);

        if (InitialDelay == -1 || ProductionInterval == -1 || ProductionQuantity == -1 || DelayVariation == -1
                || StopsQuantity == -1) {
            return false;
        } else {
            addSensor(InitialDelay, ProductionInterval, ProductionQuantity, DelayVariation, StopsQuantity, type);
            return true;
        }

    }

    public void addSensor(int InitialDelay, int ProductionInterval, int ProductionQuantity,
            int DelayVariation,
            int StopsQuantity, String type) {
        FactorySensor factorySensor = new FactorySensor();
        Sensor s = factorySensor.factory(type);
        s.setDelayVariation(DelayVariation);
        s.setInitialDelay(InitialDelay);
        s.setProductionInterval(ProductionInterval);
        s.setProductionQuantity(ProductionQuantity);
        s.setStopsQuantity(StopsQuantity);
        sensors.add(s);
    }

    public static int isNumeric(String str) {
        if (str.matches("-?\\d+(\\.\\d+)?")) {
            return Integer.parseInt(str);
        } else {
            return -1;
        }
    }
}