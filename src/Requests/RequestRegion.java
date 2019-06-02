package Requests;


import Manger.File;
import Manger.RegionManager;

public class RequestRegion {
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

    public void setRequestCurrentState(RequestState requestCurrentState) {

        System.out.println("Exit "+ this.requestCurrentState.getName());
        this.requestCurrentState = requestCurrentState;
        System.out.println("Enter "+this.requestCurrentState.getName());
    }

    public RequestState getRequestCurrentState() {return requestCurrentState;}
    public RequestState getIdleRegionRequest() {return idleRegionRequest;}
    public RequestState getRejectRequest() {return rejectRequest;}
    public RequestState getRequestApproval() {return requestApproval;}


    public void fileRequest(File file) {

        requestCurrentState.fileRequest(file);

    }


    public void timeEventAfterFourSecond(File file) {
        requestCurrentState.timeEventAfterFourSecond(file);

    }
}
