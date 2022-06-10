package control;

import java.util.ArrayList;

import model.FactorySensor;
import model.Sensor;

public class SensorControl {

    private ArrayList<Sensor> sensors;

    public SensorControl() {
        sensors = new ArrayList<Sensor>();
    }

    public void addSensor(int InitialDelay, int ProductionInterval, int ProductionQuantity, int DelayVariation,
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
}
// GerenciarSensores configurados