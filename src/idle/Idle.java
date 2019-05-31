package idle;

public class Idle implements IdleState {

    private IdleRegion idleRegion;

    public Idle(IdleRegion idleRegion) {
        this.idleRegion = idleRegion;
    }

    @Override
    public void downloadAborted() {

    }
}
