# Урок 1: Основы Java

## Что такое Java, JVM, JRE и JDK

Java — это язык программирования, который компилируется не в машинный код, а в байткод.  
Этот байткод исполняется виртуальной машиной Java — JVM (Java Virtual Machine).  
Такой подход делает Java кроссплатформенной: одна и та же программа работает на Windows, Linux и macOS без изменений.

- **JVM (Java Virtual Machine)** — виртуальная машина, которая выполняет байткод.  
- **JRE (Java Runtime Environment)** — среда выполнения, включает JVM и стандартные библиотеки.  
- **JDK (Java Development Kit)** — набор инструментов разработчика: компилятор `javac`, JRE, отладчики и утилиты.

Схема работы:
1. Исходный код (`.java`) компилируется в байткод (`.class`).
2. JVM загружает и выполняет этот байткод.

---

## Структура программы на Java

Каждая программа состоит как минимум из одного класса, а запуск начинается с метода `main`.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Разберём:
- `public class HelloWorld` — объявление класса. Имя файла должно совпадать с именем класса.
- `public static void main(String[] args)` — точка входа. Программа запускается с этого метода.
- `System.out.println()` — вывод текста в консоль.

---

## Переменные и типы данных

Переменная — это именованная область памяти, где хранится значение.  
Тип данных определяет, что может храниться в этой переменной.

### Примитивные типы:
- `byte` — 8 бит, от -128 до 127  
- `short` — 16 бит, от -32768 до 32767  
- `int` — 32 бита, целые числа  
- `long` — 64 бита, большие целые числа  
- `float` — 32 бита, дробные числа  
- `double` — 64 бита, дробные числа повышенной точности  
- `char` — символ, например `'A'`  
- `boolean` — логический тип (`true` / `false`)

### Ссылочные типы:
- `String` — строка символов, например `"Привет"`

Пример:
```java
int age = 30;
double temperature = 36.6;
boolean isReady = true;
char letter = 'A';
String name = "Саша";
```

---

## Арифметические операции

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3 (целочисленное деление)
System.out.println(a % b); // 1 (остаток от деления)
```

Чтобы получить дробный результат, хотя бы одно число должно быть `double`:
```java
System.out.println(10.0 / 3); // 3.3333333
```

---

## Логические выражения и сравнение

- `==` — равно  
- `!=` — не равно  
- `>` `<` `>=` `<=` — сравнение  
- `&&` — логическое “и”  
- `||` — логическое “или”  
- `!` — отрицание

Пример:
```java
int x = 5;
int y = 10;
System.out.println(x > y); // false
System.out.println(x < y && y < 20); // true
System.out.println(!(x == y)); // true
```

---

## Работа со строками

```java
String first = "Java";
String second = "Rocks";
String result = first + " " + second + "!";
System.out.println(result);
```

- Конкатенация строк: `+`
- Длина строки: `str.length()`
- Сравнение строк: `str1.equals(str2)`  
  (оператор `==` сравнивает ссылки, а не содержимое)

---

## Ввод данных через Scanner

Для ввода данных из консоли используется класс `Scanner`:

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        System.out.print("Введите возраст: ");
        int age = sc.nextInt();

        System.out.println("Привет, " + name + ". Тебе " + age + " лет.");
    }
}
```

Методы класса `Scanner`:
- `nextLine()` — ввод строки  
- `nextInt()` — ввод целого числа  
- `nextDouble()` — ввод дробного числа  

После `nextInt()` перед `nextLine()` добавляй дополнительный `sc.nextLine();`, чтобы очистить буфер ввода.

---

## Форматированный вывод

```java
double price = 99.9;
System.out.printf("Цена: %.2f руб.%n", price);
```

- `%.2f` — два знака после запятой  
- `%n` — перевод строки  
- `%s`, `%d`, `%f` — формат для строки, целого и дробного соответственно

---

## Примеры программ

**1. Среднее трёх чисел**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Введите три числа: ");
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
System.out.println("Среднее: " + (a + b + c) / 3);
```

**2. Проверка чётности**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Введите число: ");
int n = sc.nextInt();

if (n % 2 == 0) {
    System.out.println("Чётное");
} else {
    System.out.println("Нечётное");
}
```

**3. Перевод температуры**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Введите температуру в °C: ");
double c = sc.nextDouble();
double f = c * 9 / 5 + 32;
System.out.println("По Фаренгейту: " + f);
```

---

## Типичные ошибки новичков

1. Имя файла не совпадает с именем класса.  
2. Нет метода `main()` — программа не запускается.  
3. Использование `==` вместо `equals()` для сравнения строк.  
4. Целочисленное деление, где ожидается дробное.  
5. Отсутствует импорт `java.util.Scanner`.  
6. Использование запятой вместо точки при вводе дробных чисел.

---

## Закрепление материала

1. Перепиши все примеры из конспекта вручную.  
2. Измени их под себя — добавь новые переменные и условия.  
3. Выполни домашние задания из папки `tasks`.  
4. После этого сделай контрольную работу №1 — консольный калькулятор.
