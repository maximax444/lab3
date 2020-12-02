abstract class Things {
    private String name;
    private String description;
    Things(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void getInfo(){
        System.out.println("Это " + this.name + ". Описание: " + this.description);
    }
    public void setInfo(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
