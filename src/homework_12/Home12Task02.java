package homework_12;

/*
Task 2
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведите ее на печать.

P.S. - правильно выберите типы данных
 */


public class Home12Task02 {

    public static void main(String[] args) {

        float temprM  = 6;
        float temprTu = 2;
        float temprW  = 5;
        float temprTh = 9;
        float temprF  = 7;
        float temprSa = 3;
        float temprSu = 0;

        float temprWeek = (temprM + temprTu + temprW + temprTh + temprF + temprSa + temprSu) / 7;

        System.out.printf("Средняя Температура за неделю: %.1f°C\n", temprWeek);


    }
}
