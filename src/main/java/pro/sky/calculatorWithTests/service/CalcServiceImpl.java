package pro.sky.calculatorWithTests.service;

import org.springframework.stereotype.Service;
import pro.sky.calculatorWithTests.exceptions.BadDivideParamException;
import pro.sky.calculatorWithTests.exceptions.BadParamException;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public String hello() {
        return "Привет!\n" +
                "На связи домашнее задание урока 2.3. Введение в Maven и Spring Boot.";
    }

    @Override
    public String calcHello() {
        return "Добро пожаловать в калькулятор.";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            try {
                throw new BadParamException("один (оба) из параметров не определён(ы)");
            } catch (BadParamException e) {
                return e.getMessage();
            }
        }
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            try {
                throw new BadParamException("один (оба) из параметров не определён(ы)");
            } catch (BadParamException e) {
                return e.getMessage();
            }
        }
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            try {
                throw new BadParamException("один (оба) из параметров не определён(ы)");
            } catch (BadParamException e) {
                return e.getMessage();
            }
        }
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            try {
                throw new BadParamException("один (оба) из параметров не определён(ы)");
            } catch (BadParamException e) {
                return e.getMessage();
            }
        }
        if (num2 == 0) {
            try {
                throw new BadDivideParamException("Делить на 0 - нельзя!!!");
            } catch (BadDivideParamException e) {
                return e.getMessage();
            }
        }
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;

    }

}
