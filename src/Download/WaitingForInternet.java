package Download;

public class WaitingForInternet implements DownloadIState {
    @Override
    public void finish() {

    }

    public WaitingForInternet(DownloadRegion downloadRegion) {
    }

    @Override
    public void downloadError() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void timeEventAfterThreeSecond() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void whenQueueGreaterThenZero() {

    }
}
