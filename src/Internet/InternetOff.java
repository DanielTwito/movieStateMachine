package Internet;


public class InternetOff implements InternetStatusState {

    private InternetRegion internetRegion;

    public InternetOff(InternetRegion internetRegion) {
        this.internetRegion = internetRegion;
    }

    @Override
    public void internetOn() {
//        RegionManager.getDiskSize();
        internetRegion.setInternetStatusCurrentState(internetRegion.getConnectInternet());

    }

    @Override
    public void internetOff() {

    }

    @Override
    public String toString() {
        return "Internet Off";
    }
}
