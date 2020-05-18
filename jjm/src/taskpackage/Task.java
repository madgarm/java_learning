package taskpackage;
import static mypackage.Radius.getSquare; // статично подключаем метод getSquare класса Radius

public class Task {

    public static void main(String[] args) {
        task(-1);
    }

    public static void task(int number) {
        System.out.println(getSquare(number)); // вызываем импортированный метод и передаем ему целочисленной из внешнего метода
    }
}
