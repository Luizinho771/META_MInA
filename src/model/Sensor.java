package model;

public abstract class Sensor {
    public  int InitialDelay;
    private int ProductionInterval;
    private int ProductionQuantity;
    private int DelayVariation;
    private int StopsQuantity;

    public int getInitialDelay() {
        return InitialDelay;
    }

    public void setInitialDelay(int initialDelay) {
        InitialDelay = initialDelay;
    }

    public int getProductionInterval() {
        return ProductionInterval;
    }

    public void setProductionInterval(int productionInterval) {
        ProductionInterval = productionInterval;
    }

    public int getProductionQuantity() {
        return ProductionQuantity;
    }

    public void setProductionQuantity(int productionQuantity) {
        ProductionQuantity = productionQuantity;
    }

    public int getDelayVariation() {
        return DelayVariation;
    }

    public void setDelayVariation(int delayVariation) {
        DelayVariation = delayVariation;
    }

    public int getStopsQuantity() {
        return StopsQuantity;
    }

    public void setStopsQuantity(int stopsQuantity) {
        StopsQuantity = stopsQuantity;
    }

}
// Um objeto sensor, com as caracteristicas das configurações feitas no front