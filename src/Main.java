import Manger.File;
import Manger.RegionManager;
import Requests.RequestRegion;

public class Main {

    public static void main(String[] args) {

        RequestRegion rr = new RequestRegion();
        RegionManager rm =new RegionManager(null,null,null,null,rr,null);
        RegionManager.setDiskSize(7);
        rr.setRequestCurrentState(rr.getRejectRequest());
        rr.fileRequest(new File("f",6));
//        rr.fileRequest(new File("abc",95));

    }
}
