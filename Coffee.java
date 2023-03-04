package HomeWork;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose button:");
        int button = scanner.nextInt();

        switch (button) {
            case 1:
                System.out.println("Espresso");
                System.out.println("Неделимый процес");
                break;

            case 2:
                System.out.println("Amerikano");
                System.out.println("Приготовление эспрессо и добавление воды");
                break;

            case 3:
                System.out.println("Kopucino");
                System.out.println("Приготовление эспрессо и добавление вспененного молока");
                break;

            case 4:
                System.out.println("Tea");
                System.out.println("Выбор пакетиеи и добавление воды");
                break;

            default:
                System.out.println("You have not chosen a drink");

        }

//                                Сложность второе имели это или другое?

//            switch (button) {
//                case "Espresso", "Amerikano", "Kapucino", "Tea":
//                    System.out.println("Dreanks");
//                    break;
//                case "N":
//                    System.out.println("Choose you Dreanks");
//                default:
            }


    }


//        int winter = expresso;
//        //        buttons: 1 = Espresso, 2 = Amerikano, 3 = Kapucino, 4 = Tea
//        int good;
////        ingridient: 10 = espresso, 15 = вода, 20 = молоко, 25 = пакеты для чая
//
//        int buttons = 4; // меняется  тут
//        int ingridient = 25; // меняется  тут
//
//        if (buttons == 1) {
//
////        if (ingridient == 10)
//            System.out.println("espresso");
////
//        } else if (buttons == 2) {
//
//
//            System.out.println("espresso + вода");
//
//        } else if (buttons == 3) {
//
//
//            System.out.println("espresso + молоко");
//        } else if (buttons == 4) {
//
//
//            System.out.println("пакеты для чая + вода ");
//        }
//
//
//    }
//    }


