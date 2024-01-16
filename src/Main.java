public class Main {
    public static void main(String[] args) {
        One one = new One(2, 3);
        Two two = new Two(2, 2);
        Three three = new Three(one.multiplication(), two.sum());

        System.out.println(three.sumOfOneTwo());
    }
}