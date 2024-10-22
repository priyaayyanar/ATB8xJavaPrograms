package sept.ex_23092024;

public class Lab075_Switch {
    public static void main(String[] args) {
        //Switch - Multibranch condition
        //Day - 1 to 7 -> 1 -Monday, 2 - Tuesday,..... 7-Sunday
        int day = 1;
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
