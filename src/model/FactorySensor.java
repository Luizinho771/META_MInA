package model;

public class FactorySensor implements FactoryAbstract {

    @Override
    public Sensor factory(String type) {
        switch(type){
            case "eletromechanical":
                return new Electromechanical();
            case "magnetic":
                return new Magnetic();
            case "optical":
                return new Optical();
            case "proximity":
                return new Proximity();
            default:
                return null;
        } 
    }
   
}
