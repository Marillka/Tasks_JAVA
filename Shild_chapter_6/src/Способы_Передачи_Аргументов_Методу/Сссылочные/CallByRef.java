package Способы_Передачи_Аргументов_Методу.Сссылочные;

public class CallByRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);

    }
}
