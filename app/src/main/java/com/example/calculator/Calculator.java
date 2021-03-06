package com.example.calculator;

public class Calculator {
    private double firstNumber;
    private double lastNumber;
    private Operations operation;       // переменная для хранения типа операции (сумма, разница, деление, умножение)

    /* Метод для добавления новой цифры */
    public void addNumber(double number) {
        if (operation == null)
            firstNumber = firstNumber*10 + number;
        else lastNumber = lastNumber*10 + number;
    }

    /* Сеттер для операции */
    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    /* Операция для очистки всех данных при нажатии кнопки */
    public void clear() {
        this.firstNumber = 0;
        this.lastNumber = 0;
        this.operation = null;
    }

    /* Конструктор */
    public Calculator() {
    }

    /* Операция для подсчета значения с условием наличия оператора */
    public String operate() {
        switch (operation) {
            case SUM:
                return Double.toString(firstNumber + lastNumber);
            case DIVISION:
                return Double.toString(firstNumber / lastNumber);
            case SUBTRACTION:
                return Double.toString(firstNumber - lastNumber);
            case MULTIPLICATION:
                return Double.toString(firstNumber * lastNumber);
        }
        return "e";
    }
}
