package Requests;

public class RequestRegion implements RequestState {
    private RequestState idleRegionRequest;
    private RequestState rejectRequest;
    private RequestState requestApproval;

    private RequestState requestCurrentState;

    public RequestRegion() {
        idleRegionRequest = new IdleRegionRequest(this);
        rejectRequest = new RejectRequest(this);
        requestApproval = new RequestApproval(this);

        requestCurrentState = idleRegionRequest;
    }

    public void setRequestCurrentState(RequestState requestCurrentState) {this.requestCurrentState = requestCurrentState;}

    public RequestState getIdleRegionRequest() {return idleRegionRequest;}
    public RequestState getRejectRequest() {return rejectRequest;}
    public RequestState getRequestApproval() {return requestApproval;}

    @Override
    public void fileRequest(int fileSize) {

    }

    @Override
    public void timeEventAfterFourSecond(int fileSize) {

    }
}
