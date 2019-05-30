package UserStatus;

public class StatusAdvanced implements UserStatusState {

    private UserStatusRegion myUserStatusRegion;

    public StatusAdvanced(UserStatusRegion userStatusRegion) {
        this.myUserStatusRegion = userStatusRegion;
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
