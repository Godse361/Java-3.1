public class Main {
    public static void main(String[] args) {
        int costBilet = 27_855;
        int quantityRubForMile = 20;

        int bonusMile = costBilet / quantityRubForMile;

        System.out.println("Вы получили " + bonusMile + " бонусных миль.");
    }
}
