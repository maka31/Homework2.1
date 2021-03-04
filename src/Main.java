public class Main {

    public static void main(String[] args) {
        System.out.println(goForWalk(31, -15));
        System.out.println(goForWalk(25, 5));
        System.out.println(goForWalk(50, 0));
        System.out.println(goForWalk(86, 6));
        System.out.println(goForWalk(12, -26));
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
}
