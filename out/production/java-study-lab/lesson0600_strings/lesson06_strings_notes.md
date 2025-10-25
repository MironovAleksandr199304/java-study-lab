# Lesson 06 — Строки (Strings)

## 🧩 Основная идея
Строки в Java — это объекты класса **String**, хранящие последовательность символов.
Пример:
```java
String name = "Alexander";
```

---

## 🔹 Особенности строк
1. **String неизменяемый (immutable)** — операции создают новый объект.
2. **String Pool** — одинаковые строки не дублируются в памяти.
3. **Сравнение:**
   - `==` — сравнивает ссылки (адреса в памяти).
   - `.equals()` — сравнивает содержимое.

```java
String a = "Java";
String b = new String("Java");
System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true
```

---

## 🔹 Основные методы

| Метод | Назначение | Пример |
|--------|-------------|---------|
| `length()` | длина строки | `"Java".length()` → 4 |
| `charAt(i)` | символ по индексу | `"Java".charAt(2)` → `'v'` |
| `toLowerCase()` | в нижний регистр | `"JAVA".toLowerCase()" → `"java"` |
| `toUpperCase()` | в верхний регистр | `"java".toUpperCase()" → `"JAVA"` |
| `trim()` | удалить пробелы | `"  hi  ".trim()" → `"hi"` |
| `substring(a,b)` | подстрока | `"Hello".substring(1,4)" → `"ell"` |
| `contains()` | проверка подстроки | `"hello".contains("ell")" → true |
| `indexOf()` | индекс символа | `"hello".indexOf("e")" → 1 |
| `replace()` | замена символов | `"Java".replace("a","@")" → "J@v@" |
| `split()` | разделение строки | `"a,b,c".split(",")" → ["a","b","c"] |

---

## 🔹 Конкатенация строк

1. **Оператор +**
```java
String s = "Hello, " + "world!";
```

2. **Метод concat()**
```java
String s = "Hello".concat(" world!");
```

3. **StringBuilder**
```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 3; i++) sb.append("Hi ");
System.out.println(sb.toString()); // Hi Hi Hi 
```

---

## 🔹 StringBuilder vs String

| Свойство | String | StringBuilder |
|-----------|---------|---------------|
| Изменяемость | нет | да |
| Скорость при множественных операциях | низкая | высокая |
| Потокобезопасность | да | нет (StringBuffer — да) |

---

## 🔹 Пример: сравнение строк

```java
Scanner sc = new Scanner(System.in);
System.out.println("Введите пароль:");
String input = sc.nextLine();

if (input.equals("qwerty")) {
    System.out.println("Пароль верный");
} else {
    System.out.println("Пароль неверный");
}
```

---

## 🔹 Применение в тестировании

- Проверка текстов ошибок (`assertTrue(msg.contains("Ошибка"))`)
- Разбор JSON/XML строк
- Проверка логов
- Формирование SQL-запросов и URL-ов

---

## 🧠 Ключевые мысли
- Строки — объекты, не примитивы.  
- Для сравнения всегда `.equals()` вместо `==`.  
- Частые изменения — через `StringBuilder`.  
- `split()`, `replace()`, `substring()` — основа текстового анализа.

---

## ✅ Что нужно уметь после урока
- Сравнивать строки (`equals`, `equalsIgnoreCase`)
- Менять регистр (`toUpperCase`, `toLowerCase`)
- Искать, заменять, извлекать (`contains`, `replace`, `substring`)
- Разбивать строки (`split`)
- Использовать `StringBuilder` в циклах
