package odd_numbers_from_1_to_50_using_While_loop;

public class Main {
    public static void main(String[] arg){
        int i = 0;
        while (true){
            i++;
            if(i % 2 != 0){
                System.out.println(i + " é impar");
            }

            if(i == 50){break;}
        }
    }
}

