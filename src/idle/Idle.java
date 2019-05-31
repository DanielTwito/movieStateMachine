package idle;

public class Idle implements IdleState {

    private IdleRegion idleRegion;

    public Idle(IdleRegion idleRegion) {
        this.idleRegion = idleRegion;
    }

    @Override
    public void downloadAborted() {
    //todo get file as parameter, update the disk (increase the file size to disk) and remove the file from queue
    }

    @Override
    public String toString() {
        return "Idle";
    }
}
