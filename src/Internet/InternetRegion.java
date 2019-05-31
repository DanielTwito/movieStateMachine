package Internet;

public class InternetRegion{

    private InternetStatusState connectInternet;
    private InternetStatusState internetOff;
    private InternetStatusState internetStatusCurrentState;

    public InternetRegion() {
        connectInternet = new ConnectInternet(this);
        internetOff = new InternetOff(this);

        internetStatusCurrentState = connectInternet;
    }

    public InternetStatusState getInternetStatusCurrentState() {
        return internetStatusCurrentState;
    }

    public InternetStatusState getConnectInternet() {
        return connectInternet;
    }

    public InternetStatusState getInternetOff() {
        return internetOff;
    }

    public void internetOn() {

    }

    public void internetOff() {

    }
}
