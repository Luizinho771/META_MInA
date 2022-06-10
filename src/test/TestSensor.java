package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Electromechanical;
import model.FactorySensor;
import model.Magnetic;
import model.Optical;
import model.Proximity;
import model.Sensor;

public class TestSensor {
    Sensor s;
    FactorySensor factorySensor;
    Electromechanical electromechanical;
    Optical optical;
    Magnetic magnetic;
    Proximity proximity;

    @Test
    public void test01CreateSensorEletromechanical() {
        factorySensor = new FactorySensor();
        electromechanical = new Electromechanical();
        s = factorySensor.factory("eletromechanical");
        assertEquals(electromechanical.getClass(), s.getClass());
    }

    @Test
    public void test02CreateSensorOptical() {
        factorySensor = new FactorySensor();
        optical = new Optical();
        s = factorySensor.factory("optical");
        assertEquals(optical.getClass(), s.getClass());
    }

    @Test
    public void test03CreateSensorMagnetic() {
        factorySensor = new FactorySensor();
        magnetic = new Magnetic();
        s = factorySensor.factory("magnetic");
        assertEquals(magnetic.getClass(), s.getClass());
    }

    @Test
    public void test04CreateSensorProximity() {
        factorySensor = new FactorySensor();
        proximity = new Proximity();
        s = factorySensor.factory("proximity");
        assertEquals(proximity.getClass(), s.getClass());
    }

}
