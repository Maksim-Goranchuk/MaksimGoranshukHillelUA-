package less4Animal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main { public static void main(String[] args) throws InputMismatchException {

    Scanner scanner = new Scanner(System.in);

    double distanceRun = 200;
    double distanceSwim = 0;
    Cat cat = new Cat(distanceRun,  distanceSwim);

    distanceRun = 500;
    distanceSwim = 11;
    Animal dog = new Dog(distanceRun, distanceSwim);


    System.out.println("Кошка может пробежать: " + cat.getAnimalDistanceRun() +
            " м. Собака может пробежать: " + dog.getAnimalDistanceRun() + " м.");

    System.out.println("Введите дистанцию для бега:");
    double distance = scanner.nextDouble();

    System.out.println("Кошка пытается выполнить run(" + distance + "). Результат: " + cat.run(distance));
    System.out.println("Собака пытается выполнить run(" + distance + "). Результат: " + dog.run(distance));
    System.out.println("                ");


    System.out.println("Кошка может проплыть: " + cat.getAnimalDistanceSwim() +
            " м. Собака может проплыть: " + dog.getAnimalDistanceSwim() + " м.");

    System.out.println("Введите дистанцию для плавания:");
    distance = scanner.nextDouble();

    System.out.println("Кошка не умеет плавать (" + distance + "). Результат: " + cat.swim(distance));
    System.out.println("Собака пытается выполнить swim(" + distance + "). Результат: " + dog.swim(distance));

}


}

