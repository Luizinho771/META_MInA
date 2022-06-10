package view;

public class ScreenBridge {
    HomeScreen homescreen;
    SelectSensorScreen selectsensorscreen;
    ConfigScreen configscreen;

    public ScreenBridge(HomeScreen homescreen, SelectSensorScreen selectsensorscreen, ConfigScreen configscreen) {
        this.homescreen = homescreen;
        this.selectsensorscreen = selectsensorscreen;
        this.configscreen = configscreen;
    }

    public void HometoSelect() {
        homescreen.changeVisible(false);
        selectsensorscreen.changeVisible(true);
    }

    public void SelecttoHome() {
        homescreen.changeVisible(true);
        selectsensorscreen.changeVisible(false);
    }

    public void SelecttoConfig(String type) {
        selectsensorscreen.changeVisible(false);
        configscreen.changeVisible(true);
        configscreen.setType(type);
    }

    public void ConfigtoSelect() {
        selectsensorscreen.changeVisible(true);
        configscreen.changeVisible(false);
    }
}
