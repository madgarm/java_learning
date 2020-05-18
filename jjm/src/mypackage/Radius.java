package mypackage;

public class Radius {
    public static double getSquare(int radius) { // методу передаету целочисленное
        if (radius < 0) { // проверка на действительность числа
            return -1; // возвращаем маркер
        } else { // если все ок
            return (Math.PI * Math. pow(radius, 2)); // считаем радиус и возвращаем его
        }
    }
}
