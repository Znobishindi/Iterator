public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(25, 100)) {
            System.out.println("Случайное число: " + r);
            if (r < 30) {
                System.out.println("Выпало число меньше 30, давайте на этом закончим");
                break;
            }
        }
    }
}
