package Requests;

import Manger.File;
import Manger.RegionManager;

import java.util.Queue;

public class RequestApproval implements RequestState {

    private RequestRegion myRequestRegion;
    public String name = "RequestApproval";

    public RequestApproval(RequestRegion requestRegion) {
    this.myRequestRegion=requestRegion;
    }


    public void doAction(File file){
        Queue<File> q = RegionManager.getRequestsQueue();
        q.add(file);
        System.out.println("file "+ file.getFileName() +" add to Download Queue Successfully!");
        RegionManager.whenQueueGreaterThenZero();
        myRequestRegion.setRequestCurrentState(myRequestRegion.getIdleRegionRequest());
    }


    @Override
    public void fileRequest(File file) {


    }

    @Override
    public void timeEventAfterFourSecond(File file) {

    }

    @Override
    public String getName() {
        return name;
    }
}
