package idle;

public class IdleRegion{

    private IdleState idle;

    public IdleRegion()
    {
        idle = new Idle(this);
    }

    public void downloadAborted() {
        idle.downloadAborted();
        //neec to do fileInQueue and remove

    }
}
