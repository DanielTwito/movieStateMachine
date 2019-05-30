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

    }

    @Override
    public void whenPointsLessthenSeven() {

    }

    @Override
    public void whenPointsGreaterOrEqualSeven() {

    }
}
