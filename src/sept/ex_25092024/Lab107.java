package sept.ex_25092024;

public class Lab107 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++){ // 0 to 9
            //System.out.println(i);
            if (i == 5){
                continue;
            }
            System.out.println(i); // when it comes to i == 5 iteration , then it will not print the i value.
            //it will just skip the print statement and goes to the next iteration.
        }

        for (int j = 0 ; j < 10 ; j++){ // 0 to 9
            //System.out.println(i);
            if (j == 5){
                break;
            }
            System.out.println(j); // when it comes to i == 5 iteration , then it will not print the i value.
            //it will just skip the print statement and will not go to the next iteration.
        }
    }
}
