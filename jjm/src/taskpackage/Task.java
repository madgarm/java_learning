package taskpackage;
import static mypackage.Radius.getSquare; // статично подключаем метод getSquare класса Radius

public class Task {

    public static void main(String[] args) {
        System.out.println(task(-1));
    }

    public static double task(int number) {
        return getSquare(number); // вызываем импортированный метод и передаем ему целочисленной из внешнего метода
    }
}
