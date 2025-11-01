# Lesson10 — Stream API и лямбды

## 1. Что такое Stream API
Stream API — это современный способ обработки коллекций в Java.  
Он позволяет писать не *как сделать* (через циклы), а *что нужно сделать* (через операции потока).  
Поток (stream) — это не коллекция, а «труба», по которой проходят данные, последовательно фильтруясь, сортируясь и преобразуясь.

**Императивно (по старинке):**
```java
for (String name : names) {
    if (name.length() > 3) {
        System.out.println(name);
    }
}
```

**Декларативно (через Stream API):**
```java
names.stream()
     .filter(n -> n.length() > 3)
     .forEach(System.out::println);
```

Такой код проще, короче и безопаснее при работе с большими коллекциями.

---

## 2. Основные операции Stream API

| Метод | Назначение |
|-------|-------------|
| `filter()` | фильтрует элементы по условию |
| `map()` | преобразует элемент в новый вид |
| `forEach()` | выполняет действие над каждым элементом |
| `count()` | возвращает количество элементов |
| `sorted()` | сортирует элементы |
| `collect()` | собирает результат в коллекцию |

---

## 3. Повторение старых тем: работа с Scanner и ArrayList

```java
import java.util.*;

public class StreamIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Введите имена (stop для выхода):");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            names.add(input);
        }

        System.out.println("Список введённых имён: " + names);
    }
}
```

---

## 4. Первый пример с Stream API

Выведем все имена, начинающиеся с буквы «А», в верхнем регистре:

```java
names.stream()
     .filter(n -> n.startsWith("А"))
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

---

## 5. Stream + HashMap (фильтрация по значению)

```java
Map<String, String> results = new HashMap<>();
results.put("LoginTest", "passed");
results.put("LogoutTest", "failed");
results.put("ProfileTest", "passed");

results.entrySet().stream()
       .filter(e -> e.getValue().equals("passed"))
       .map(Map.Entry::getKey)
       .forEach(System.out::println);
```
Результат:
```
LoginTest
ProfileTest
```

---

## 6. Stream + Queue (обработка задач)

```java
Queue<String> tasks = new LinkedList<>();
tasks.add("Login");
tasks.add("Profile");
tasks.add("Logout");

long count = tasks.stream()
                  .filter(t -> t.toLowerCase().contains("o"))
                  .count();

System.out.println("Количество задач с буквой 'o': " + count);
```

---

## 7. Лямбда-выражения

Лямбда — это короткая форма записи анонимных функций.

Пример:
```java
n -> n.startsWith("А")
```
означает: «взять элемент n и вернуть true, если он начинается с А».

Раньше приходилось писать громоздкий анонимный класс:
```java
new Predicate<String>() {
    public boolean test(String n) {
        return n.startsWith("А");
    }
}
```

---

## 8. Зачем это QA-инженеру

- фильтровать списки ответов API;
- сравнивать данные из двух коллекций (ожидаемые и фактические);
- проверять уникальность и сортировку;
- собирать статистику по тестам и логам;
- работать с данными CSV и JSON без лишних циклов.

---

## 9. Краткое повторение
- мы повторили `Scanner`, `ArrayList`, `HashMap`, `Queue`;  
- научились превращать коллекции в потоки и фильтровать данные;  
- познакомились с лямбда-выражениями и методами `filter`, `map`, `forEach`, `count`.

---

## Далее
Следующий шаг — практические задачи:

1. **Task01StreamFilter** — фильтрация строк из консоли.  
2. **Task02StreamMap** — работа с Map и фильтрацией тестов по статусу.  
3. **Task03StreamAdvanced** — комбинирование фильтрации, сортировки и сбора статистики.

После выполнения будет мини-тест Lesson10 Review.
