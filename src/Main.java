import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(goForWalk(31, -15));
        System.out.println(goForWalk(25, 5));
        System.out.println(goForWalk(50, 0));
        System.out.println(goForWalk(86, 6));
        System.out.println(goForWalk(12, -26));
        System.out.println("------------------------------");

        System.out.println(goForWalk(generateRandomAge(), -15));
        System.out.println(goForWalk(generateRandomAge(), 5));
        System.out.println(goForWalk(generateRandomAge(), 6));
        System.out.println(goForWalk(generateRandomAge(), -26));
    }

    public static String goForWalk(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
       int randomAge = random.nextInt(60);
        System.out.println("Age: " + randomAge);
        return randomAge;

    }
}
