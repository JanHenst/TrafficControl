public class TrafficLight {

    private int id;
    private int AllLights;
    private int StartingColor;
    private String CurrentLight;

    // een constructor die zonder variablen opstuurd
    public TrafficLight() {
        id = 0;
        AllLights = 3;
        StartingColor = 1;
    }

    // een constructor die variablen opstuurt
    public TrafficLight(int id, int AllLights) {
        this.id = id;
        this.AllLights = AllLights;
    }

    // deze functie laat zorgt ervoor dat er een kleur wordt gelogged bij de verschillende cases
    public String showColor(int light) {

        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                break;
            default:
                System.out.println("Red");
                result = "red";
                break;
        }
        return result;
    }

    public int showId() {
       return id;
    }

    // laat de color en id zien
    public void showColorAndId(int light) {
        String result;
        result = showColor(light);

        System.out.println("My color is "
                + result
                + " and my id is: "
                + showId()
        );
    }

    // zorgt ervoor dat het nummer nooit onder de 0 komt
    public boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    public int getStartingColor() {
        return StartingColor;
    }

    public void setStartingColor(int startingColor) {
        this.StartingColor = startingColor;
    }

    public int getAllLights() {
        return AllLights;
    }

    public void setAllLights(int allLights) {
        this.AllLights = allLights;
    }

    public String changeColor(int light) {
        id = 1;
        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                id++;
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                id++;
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                id++;
                break;
            default:
                System.out.println("Red");
                result = "red";
                id = 0;
                break;
        }
        return result;
    }
}
