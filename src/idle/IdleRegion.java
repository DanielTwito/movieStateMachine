package idle;

public class IdleRegion implements idleState {

    public  idleState idle;

    public IdleRegion()
    {
        idle = new Idle(this);
    }

    @Override
    public void downloadAborted() {

        //neec to do fileInQueue and remove

    }
}
