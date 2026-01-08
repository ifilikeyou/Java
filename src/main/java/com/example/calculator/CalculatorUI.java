package com.example.calculator;

import java.util.Scanner;

/**
 * 计算器用户界面类，提供交互式计算器功能
 */
public class CalculatorUI {
    private Calculator calculator;
    private Scanner scanner;
    
    public CalculatorUI() {
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * 显示计算器菜单
     */
    public void showMenu() {
        System.out.println("\n========== 计算器 ==========");
        System.out.println("1. 加法 (+)");
        System.out.println("2. 减法 (-)");
        System.out.println("3. 乘法 (*)");
        System.out.println("4. 除法 (/)");
        System.out.println("5. 幂运算 (^)");
        System.out.println("6. 求余 (%)");
        System.out.println("7. 平方根 (√)");
        System.out.println("8. 阶乘 (!)");
        System.out.println("9. 退出程序");
        System.out.println("===========================");
        System.out.print("请选择操作 (1-9): ");
    }
    
    /**
     * 运行计算器程序
     */
    public void run() {
        System.out.println("欢迎使用计算器程序！");
        
        while (true) {
            try {
                showMenu();
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        performAddition();
                        break;
                    case 2:
                        performSubtraction();
                        break;
                    case 3:
                        performMultiplication();
                        break;
                    case 4:
                        performDivision();
                        break;
                    case 5:
                        performPower();
                        break;
                    case 6:
                        performModulo();
                        break;
                    case 7:
                        performSquareRoot();
                        break;
                    case 8:
                        performFactorial();
                        break;
                    case 9:
                        System.out.println("感谢使用计算器程序，再见！");
                        return;
                    default:
                        System.out.println("无效选择，请输入1-9之间的数字。");
                }
            } catch (Exception e) {
                System.out.println("输入错误: " + e.getMessage());
                scanner.nextLine(); // 清除错误输入
            }
            
            System.out.println("\n按回车键继续...");
            scanner.nextLine(); // 等待用户按回车
            scanner.nextLine(); // 读取回车符
        }
    }
    
    private void performAddition() {
        System.out.print("请输入第一个数字: ");
        double a = scanner.nextDouble();
        System.out.print("请输入第二个数字: ");
        double b = scanner.nextDouble();
        double result = calculator.add(a, b);
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, result);
    }
    
    private void performSubtraction() {
        System.out.print("请输入第一个数字: ");
        double a = scanner.nextDouble();
        System.out.print("请输入第二个数字: ");
        double b = scanner.nextDouble();
        double result = calculator.subtract(a, b);
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, result);
    }
    
    private void performMultiplication() {
        System.out.print("请输入第一个数字: ");
        double a = scanner.nextDouble();
        System.out.print("请输入第二个数字: ");
        double b = scanner.nextDouble();
        double result = calculator.multiply(a, b);
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, result);
    }
    
    private void performDivision() {
        System.out.print("请输入被除数: ");
        double a = scanner.nextDouble();
        System.out.print("请输入除数: ");
        double b = scanner.nextDouble();
        
        try {
            double result = calculator.divide(a, b);
            System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
        } catch (ArithmeticException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
    
    private void performPower() {
        System.out.print("请输入底数: ");
        double base = scanner.nextDouble();
        System.out.print("请输入指数: ");
        double exponent = scanner.nextDouble();
        double result = calculator.power(base, exponent);
        System.out.printf("%.2f ^ %.2f = %.2f\n", base, exponent, result);
    }
    
    private void performModulo() {
        System.out.print("请输入被除数: ");
        double a = scanner.nextDouble();
        System.out.print("请输入除数: ");
        double b = scanner.nextDouble();
        
        try {
            double result = calculator.modulo(a, b);
            System.out.printf("%.2f %% %.2f = %.2f\n", a, b, result);
        } catch (ArithmeticException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
    
    private void performSquareRoot() {
        System.out.print("请输入要开平方的数字: ");
        double a = scanner.nextDouble();
        
        try {
            double result = calculator.sqrt(a);
            System.out.printf("√%.2f = %.2f\n", a, result);
        } catch (ArithmeticException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
    
    private void performFactorial() {
        System.out.print("请输入要计算阶乘的整数: ");
        int n = scanner.nextInt();
        
        try {
            long result = calculator.factorial(n);
            System.out.printf("%d! = %d\n", n, result);
        } catch (IllegalArgumentException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        CalculatorUI calculatorUI = new CalculatorUI();
        calculatorUI.run();
    }
}