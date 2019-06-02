import Manger.File;
import Manger.SystemManager;
import Requests.RequestRegion;
import UserStatus.UserStatusRegion;

public class Main {

    public static void main(String[] args) {

        SystemManager mng=new SystemManager(1000);
        mng.internetOff();
        mng.internetOn();



    }
}
