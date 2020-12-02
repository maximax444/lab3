public class Switch extends Things {
    private Boolean switchCondition;
    Switch(String name, String description) {
        super(name, description);
        this.switchCondition = false;
    }
    public Boolean getSwitchCondition() {
        return this.switchCondition;
    }
    public void switchOn() {
        this.switchCondition = true;
    }
}
