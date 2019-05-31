package UserStatus;

public class StatusBeginner implements UserStatusState {

    private UserStatusRegion myUserStatusRegion;

    public StatusBeginner(UserStatusRegion userStatusRegion) {
        this.myUserStatusRegion =userStatusRegion;
    }

    @Override
    public void whenPointsLessthenFour() {

    }

    @Override
    public void whenPointsGreaterOrEqualFour() {
        //System.out.println("exit beginner");
        myUserStatusRegion.setUserStatusStateCurrent(myUserStatusRegion.getStatusAdvanced());
    }

    @Override
    public void whenPointsLessthenSeven() {

    }

    @Override
    public void whenPointsGreaterOrEqualSeven() {

    }

    @Override
    public String toString() {
        return "Beginner Status";
    }
}
