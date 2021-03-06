package com.example.calculator;

public class Calculator {
    private Double firstNumber;
    private Double lastNumber;
    private Operations operation;       // переменная для хранения типа операции (сумма, разница, деление, умножение)

    /* Метод для добавления новой цифры */
    public void addNumber(double number) {
        if (operation == null)
            if (firstNumber == null) firstNumber = number;
            else firstNumber = firstNumber*10 + number;
        else if (lastNumber == null) lastNumber = number;
        else lastNumber = lastNumber*10 + number;
    }

    /* Сеттер для операции */
    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    /* Операция для очистки всех данных при нажатии кнопки */
    public void clear() {
        this.firstNumber = null;
        this.lastNumber = null;
        this.operation = null;
    }

    /* Конструктор */
    public Calculator() {
    }

    /* Операция для подсчета значения с условием наличия оператора */
    public String operate() {
        if (firstNumber != null && lastNumber != null) {
            switch (operation) {
                case SUM:
                    return Double.toString(firstNumber + lastNumber);
                case DIVISION:
                    return Double.toString(firstNumber / lastNumber);
                case SUBTRACTION:
                    return Double.toString(firstNumber - lastNumber);
                case MULTIPLICATION:
                    return Double.toString(firstNumber * lastNumber);
                default:
                    return "E";
            }
        }
        return "E";
    }
}
