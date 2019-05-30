package idle;

public class Idle implements idleState {

    private IdleRegion idleRegion;

    public Idle(IdleRegion idleRegion) {
        this.idleRegion = idleRegion;
    }

    @Override
    public void downloadAborted() {

    }
}
