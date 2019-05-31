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

    public void setInternetStatusCurrentState(InternetStatusState internetStatusCurrentState) {
        System.out.println("Exit "+this.internetStatusCurrentState.toString());
        this.internetStatusCurrentState = internetStatusCurrentState;
        System.out.println("Enter "+this.internetStatusCurrentState.toString());

    }


    public void internetOn() {
        internetStatusCurrentState.internetOn();

    }

    public void internetOff() {
        internetStatusCurrentState.internetOff();
    }
}
