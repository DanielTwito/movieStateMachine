package Requests;

public class RequestRegion implements RequestState {
    public RequestState idleRegionRequest;
    public RequestState rejectRequest;
    public RequestState requestApproval;

    public RequestState requestStateCurrent;

    public RequestRegion() {
        idleRegionRequest = new IdleRegionRequest(this);
        rejectRequest = new RejectRequest(this);
        requestApproval = new RequestApproval(this);

        requestStateCurrent = idleRegionRequest;
    }

    @Override
    public void fileRequest(int fileSize) {

    }

    @Override
    public void timeEventAfterFourSecond(int fileSize) {

    }
}
