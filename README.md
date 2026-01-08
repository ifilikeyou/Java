# 计算器应用程序

这是一个功能齐全的Java计算器程序，提供基本的数学运算功能。

## 项目结构

```
Java/
├── pom.xml                 # Maven项目配置文件
├── README.md               # 项目说明文档
├── .mvn/
│   └── maven-wrapper.properties # Maven包装器配置
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── calculator/
│   │                   ├── Calculator.java      # 计算器核心类
│   │                   ├── CalculatorUI.java    # 计算器用户界面类
│   │                   └── Main.java            # 程序主入口
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── calculator/
│                       └── CalculatorTest.java  # 计算器测试类
```

## 功能特性

- 基本运算：加法、减法、乘法、除法
- 高级运算：幂运算、求余、平方根、阶乘
- 错误处理：除零检测、负数开方检测、负数阶乘检测
- 交互式界面：命令行菜单操作

## 依赖

- Java 11+
- Maven 3.6+
- JUnit 5 (用于测试)

## 如何运行

1. 确保已安装Java 11+ 和 Maven
2. 在项目根目录执行：
   ```bash
   mvn compile
   ```
3. 运行计算器程序：
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.calculator.CalculatorUI"
   ```
4. 运行测试：
   ```bash
   mvn test
   ```

## 解决JDK版本问题

如果遇到"无法编译为JVM目标11"的错误，请确保：

1. 您的系统已安装JDK 11或更高版本
2. IDEA项目SDK设置为JDK 11或更高版本
3. 模块语言级别设置为11或更高版本

在IDEA中检查和修改设置：
- File → Project Structure → Project → Project SDK: 选择JDK 11+
- File → Project Structure → Modules → Language Level: 选择11或更高

## 代码说明

- [Calculator](src/main/java/com/example/calculator/Calculator.java)：计算器核心类，包含所有数学运算方法
- [CalculatorUI](src/main/java/com/example/calculator/CalculatorUI.java)：提供交互式用户界面，处理用户输入和结果显示
- [Main](src/main/java/com/example/calculator/Main.java)：程序入口点
- [CalculatorTest](src/test/java/com/example/calculator/CalculatorTest.java)：包含所有计算器功能的单元测试