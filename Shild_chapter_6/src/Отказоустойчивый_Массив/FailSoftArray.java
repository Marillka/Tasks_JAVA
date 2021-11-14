package Отказоустойчивый_Массив;

// В этом классе реализуется "отказоустойчивый" массив, предотвращающий ошибки времени выполнения.
public class FailSoftArray {
    private int a[]; // ссылка на массив
    private int errval; // значение, возвращаемое в случае возникновения ошиьки при выполнении метода get()

    public int length; // открытакая переменная length

    // Конструктору данного класса передаются размер массива и значение, которое должен возвращать
    // метод get() при возникновении ошибки
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Возвращает значеня элемента массива с заданным индексом
    public int get(int index) {
        if (indexOk(index)) return a[index];
        return errval;
    }

    // Установка значения элемента с заданным индексом. Если возникает ошибка, вернуть false.
    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Метод для возврата логического значения true, если индекс не выходит за пределы массива
    private boolean indexOk(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}
