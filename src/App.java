
import control.ControlePorta;
import view.ConfigScreen;
import view.HomeScreen;
import view.ScreenBridge;
import view.SelectSensorScreen;

public class App {
    static HomeScreen homescreen;
    static SelectSensorScreen selectsensorscreen;
    static ConfigScreen configscreen;
    static ScreenBridge bridge;
    static ControlePorta controlePorta;
    public static void main(String[] args) throws Exception {
        homescreen = new HomeScreen();
        selectsensorscreen = new SelectSensorScreen();
        configscreen = new ConfigScreen();
        bridge = new ScreenBridge(homescreen, selectsensorscreen, configscreen);

        homescreen.setBridge(bridge);
        selectsensorscreen.setBridge(bridge);
        configscreen.setBridge(bridge);
        controlePorta = new ControlePorta("COM5", 9600);

    }
}
