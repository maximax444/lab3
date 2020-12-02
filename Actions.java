public interface Actions {
    void tryToOpenTheDoor (Button b, Door d);
    void pressTheButton(Button b);
    void goTo(Place place, Door d);
    void switchLamp(Switch sw, Human[] people);
}
