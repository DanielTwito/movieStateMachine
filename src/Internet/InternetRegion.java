package Internet;

public class InternetRegion implements InternetStatusState{

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

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }
}
