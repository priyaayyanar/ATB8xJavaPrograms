package sept.ex_23092024;

public class Lab078_Switch {
    public static void main(String[] args) {
        //different Input
        int day = 5;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("No idea what is the day");

        }
        System.out.println("End of the loop");
    }
}
