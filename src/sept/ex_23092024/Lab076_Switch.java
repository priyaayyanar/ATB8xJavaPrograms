package sept.ex_23092024;

public class Lab076_Switch {
    public static void main(String[] args) {
        //Partially without break
        int day = 1;
        switch (day)
        {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea what is the day");
                break;
        }
        System.out.println("End of the loop");
    }
}
