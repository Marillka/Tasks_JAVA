package Способы_Передачи_Аргументов_Методу.Простые_типы_данных;

class CallByValue {
        public static void main(String[] args) {
            Test ob = new Test();

            int a = 15, b = 20;

            System.out.println("a и b перед вызовом " + a + " " + b);

            ob.noChange(a, b);

            System.out.println("a и b после вызова " + a + " " + b);


        }
    }

