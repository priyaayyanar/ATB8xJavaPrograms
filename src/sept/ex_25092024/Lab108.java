package sept.ex_25092024;

public class Lab108 {
    public static void main(String[] args) {
        //print even and odd numbers from 0 10 50
        for (int i = 0 ; i <=50 ; i++){
            if(i%2 == 0){
                System.out.println("Even -> "+i);
                continue;
            }
            System.out.println("Odd -> "+i);
        }
    }
}
