import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> randomCats = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            Cat cat = new Cat();
            randomCats.add(cat);

            for (int j = i; j < randomCats.size(); j++) {
                System.out.print("Имя " + i + " кота: " + randomCats.get(j).getCatName() + " | ");
                System.out.print("Возраст: " + randomCats.get(j).getCatAge() + " | ");
                System.out.print("Пол: " + randomCats.get(j).getCatSex() + " | ");
                System.out.print("Наличие прививок: " + randomCats.get(j).getVaccinated() + " | ");
                System.out.print("Имя хозяина: " + randomCats.get(j).getOwnerName());
            }

            System.out.println();
        }

    }
}
