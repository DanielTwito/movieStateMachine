package Internet;

public class ConnectInternet implements InternetStatusState {

    private InternetRegion internetRegion;

    public ConnectInternet(InternetRegion internetRegion) {

        this.internetRegion = internetRegion;
    }

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {
        internetRegion.setInternetStatusCurrentState(internetRegion.getInternetOff());

    }

    @Override
    public String toString() {
        return "Connect Internet";
    }
}
