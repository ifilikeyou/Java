package com.example.calculator;

/**
 * 计算器类，提供基本的数学运算功能
 */
public class Calculator {
    
    /**
     * 加法运算
     * @param a 第一个操作数
     * @param b 第二个操作数
     * @return 两数之和
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * 减法运算
     * @param a 第一个操作数
     * @param b 第二个操作数
     * @return 两数之差
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * 乘法运算
     * @param a 第一个操作数
     * @param b 第二个操作数
     * @return 两数之积
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * 除法运算
     * @param a 被除数
     * @param b 除数
     * @return 两数之商
     * @throws ArithmeticException 当除数为0时抛出异常
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return a / b;
    }
    
    /**
     * 幂运算
     * @param base 底数
     * @param exponent 指数
     * @return 幂运算结果
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    /**
     * 求余运算
     * @param a 被除数
     * @param b 除数
     * @return 余数
     * @throws ArithmeticException 当除数为0时抛出异常
     */
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return a % b;
    }
    
    /**
     * 平方根运算
     * @param a 被开方数
     * @return 平方根
     * @throws ArithmeticException 当被开方数为负数时抛出异常
     */
    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("负数不能开平方根");
        }
        return Math.sqrt(a);
    }
    
    /**
     * 阶乘运算
     * @param n 要计算阶乘的整数
     * @return n的阶乘
     * @throws IllegalArgumentException 当n为负数时抛出异常
     */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("阶乘不能计算负数");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}