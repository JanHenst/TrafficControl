public class Crossing {

    private static int numberOfLights = 3;
    private static int numberOfTrafficlights = 4;

    public static void main(String[] args) {

        System.out.println(
            "Initializing " +
            "Traffic " +
            "Crossing"
        );

        TrafficController controller =
                new TrafficController();
    }

    public static int getNumberOfTrafficlights() { return numberOfTrafficlights; }

    public static int getNumberOfLights() { return numberOfLights; }

}

public class TrafficController {
    //Array of TrafficLight objects.
    private TrafficLight[] trafficlights;

    public TrafficController() {
        System.out.println(
          "Total number of Traffic lights: " +
          Crossing.getNumberOfTrafficLights());

        //Set the array size
        this.trafficlights =
                new TrafficLight [
                    Crossing.getNumberOfTrafficLights()
                ];

        for(int count = 0;
            count < Crossing.getNumberOfTrafficLights();
            count++) {

            trafficlights[count] =
                     new Trafficlight(
                            count,
                            Crossing.getNumberOfLights()
                     );
            System.out.println("Current color: " +
                    trafficlights[count].getCurrentColor()
            );
        }
    }
}

//
// Initialize a new trafficlight with
// an id and how many lights the trafficlight has.
//
// @param id             The id for the trafficlight
// @param numberOfLights The number of lights for trafficlight
//
public TrafficLight(int id, int numberOfLights) {
    this.id = id;
    this.numberOfLights = numberOfLights;

    //random light color
    setCurrentColor(createRandomNumber(3) + 1);

}