public class MyClass {
    private int alpha;// закрытый доступ
    public int beta;// открытый доступ
    int gamma;// тип доступа по умолчанию (по сути, public)


    // Методы доступа к переменной alpha. Члены класса могут обращаться к закрытыми членам того же класса.
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }


    class AccesDemo {
        public static void main(String[] args) {
            MyClass ob = new MyClass();

            // Доступ к переменной alpha возможен только с помощью специально предназначенных для этой цели методов
            ob.setAlpha(-99);
            System.out.println("ob.alpha: " + ob.getAlpha());

            // Обращение к переменной alpha так, как показано ниже недопустимо
            // ob.alpha = 10 // ошибка: alpha - закрытая переменная!

            // Следующие обращения вполне допустимы, так как переменные beta и gamma яаляются открытыми
            ob.beta = 88;
            ob.gamma = 99;
        }



    }
}
