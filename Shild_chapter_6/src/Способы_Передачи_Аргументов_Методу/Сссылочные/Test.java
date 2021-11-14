package Способы_Передачи_Аргументов_Методу.Сссылочные;

public class Test {
    int a, b;

    Test(int i , int j) {
        a = i;
        b = j;
    }

    // Передача объекта методу. Теперь переменнные ob.a и ob.b объекта, используемого при вызове, также будут изменяться.
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
