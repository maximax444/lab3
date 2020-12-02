public class Main {
    public static void main(String[] args){
        Human neznaika = new Human("Незнайка", Place.OUTOFSECTION);
        Human ponchik = new Human("Пончик", Place.OUTOFSECTION, 40);
        Button button = new Button("Кнопка", "Большая красная кнопка, открывающая дверь в отсек");
        Door door = new Door("Дверь", "Открывается по нажатию кнопки рядом");
        Switch sw = new Switch("Выключатель", "Включает и выключает свет в отсеке");
        Human[] people = new Human[2];
        people[0] = neznaika;
        people[1] = ponchik;
        System.out.println(neznaika.toString());
        System.out.println(ponchik.toString());
        ponchik.sayCondition();
        neznaika.sayCondition();

        neznaika.goTo(Place.LADDER, door);
        neznaika.tryToOpenTheDoor(button, door);
        neznaika.pressTheButton(button);
        neznaika.pressTheButton(button);
        neznaika.pressTheButton(button);
        neznaika.tryToOpenTheDoor(button, door);
        neznaika.goTo(Place.LADDER, door);
        ponchik.goTo(Place.LADDER, door);
        neznaika.switchLamp(sw, people);

    }
}
