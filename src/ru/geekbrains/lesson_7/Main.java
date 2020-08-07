package ru.geekbrains.lesson_7;

public class Main {

    private static int TIME = 0;

    public static void main(String[] arge) {

        Cat[] cat = new Cat[3];
        cat [0] = new Cat("Shal", 200, 2);
        cat [1] = new Cat("Doly", 100, 3);
        cat [2] = new Cat("Lord", 70, 1);
        Plate plate = new Plate(600);
        System.out.println("У меня три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + ", которых я кормлю каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " час(а) соответственно.");
        System.out.println("Они вечно хотят жрать. В миске " + plate.getFood() + " Граммов \n");

        do {
            for (Cat i : cat) {

                if (i.getSatiety() == 0) {

                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 24);
    }
}

