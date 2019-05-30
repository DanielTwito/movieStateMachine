package Requests;

public class RequestApproval implements RequestState {
    private RequestRegion myRequestRegion;

    public RequestApproval(RequestRegion requestRegion) {
    this.myRequestRegion=requestRegion;
    }

    @Override
    public void fileRequest(int fileSize) {

    }

    @Override
    public void timeEventAfterFourSecond(int fileSize) {

    }
}
