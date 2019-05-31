package Manger;

public class SystemManager{

    private SystemState systemOn;
    private SystemState waitingFoeInternet;
    private SystemState systemOff;

    private SystemState systemCurrentState;

    public void internetOn() {
        systemCurrentState.internetOn();
    }


    public void turnOn() {
        systemCurrentState.turnOn();
    }


    public void turnOff() {
        systemCurrentState.turnOff();
    }


    public SystemState getSystemOn() {
        return systemOn;
    }

    public SystemState getWaitingFoeInternet() {
        return waitingFoeInternet;
    }

    public SystemState getSystemOff() {
        return systemOff;
    }

    public SystemState getSystemCurrentState() {
        return systemCurrentState;
    }

    public void setSystemCurrentState(SystemState systemCurrentState) {
        this.systemCurrentState = systemCurrentState;
    }
}
