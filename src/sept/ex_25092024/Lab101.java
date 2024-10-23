package sept.ex_25092024;

public class Lab101 {
    public static void main(String[] args) {
        //we can do the initialization in outside of the loop also.
        int i = 10;
        //if we do the initialization outside then we should leave that part empty inside the loop.
        for ( ; i > 0; i--){
            System.out.println(i);
        }
    }
}
