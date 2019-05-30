package Requests;

public class RejectRequest implements RequestState {

    private RequestRegion myRequestRegion;

    public RejectRequest(RequestRegion requestRegion) {
        this.myRequestRegion = requestRegion;
    }

    @Override
    public void fileRequest(int fileSize) {

    }

    @Override
    public void timeEventAfterFourSecond(int fileSize) {

    }
}
