package org.example.homework_2.task_9;

// Задача 9 - это одна программа
public class Triangle_1 {
    public static void main(String[] args) {
        int i = 0; // зачем i вынес сюда? верни в условие цикла for ()
        int j = 0;  // j - придумай говорящее название переменной
        for (i = 0; i < 4; i++) {
            if (i == j) {
                System.out.println("****"); // такой вариант кода называется "Хардкод". 
                /* Когда пишешь программу стоит подумать как она будет себя вести на других данных, например, если я захочу изменить размер треугольника,
                т.е. меняю 4 на 10 и треугольник становится больше, при этом без других изменений в коде
                */
                if (i == j++) {
                    System.out.println(" ***");
                    if (i != j) {
                        System.out.println("  **");
                        break;
                    }
                }
            }
        }
        System.out.println("   *");
    }
}
