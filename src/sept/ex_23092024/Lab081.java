package sept.ex_23092024;

public class Lab081 {
    public static void main(String[] args) {
        char c = 'A'; //65 -> char is an integer data type. So the empty switch statement of char also valid
        switch (c)
        {

        }

        //boolean is not acceptable in switch case
        //boolean b = true;
        //switch (b)
        {
        }

        //long is acceptable with its wrapper type.
        long l = 30L;
        switch ((int) l) // long is wrapped by int type here
        {

        }

    }
}
