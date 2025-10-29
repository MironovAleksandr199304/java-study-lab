# Lesson 07 — Наследование (Inheritance)

## 🧩 Что такое наследование
Наследование — это способ **создавать новые классы на основе уже существующих**, чтобы переиспользовать код и не дублировать логику.

Класс, от которого наследуются, называется **родительским** (или *базовым*).  
Класс, который наследуется, — **потомком** (или *дочерним*).

В Java наследование обозначается ключевым словом **`extends`**.

---

## 💡 Пример
```java
public class Animal {
    String name;

    public void eat() {
        System.out.println(name + " ест.");
    }
}
```

Теперь создадим потомка:

```java
public class Dog extends Animal {
    public void bark() {
        System.out.println(name + " лает!");
    }
}
```

Использование:

```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Бобик";
        dog.eat();   // метод из Animal
        dog.bark();  // метод из Dog
    }
}
```

Результат:
```
Бобик ест.
Бобик лает!
```

---

## 🔹 Ключевые понятия

| Термин | Описание |
|--------|-----------|
| `extends` | Указывает, что класс наследует другой класс |
| `super` | Ссылка на родительский класс |
| `@Override` | Показывает, что метод переопределён в потомке |

---

## 🔹 Конструкторы и super

Когда ты создаёшь объект потомка, **сначала выполняется конструктор родителя**, затем — потомка.

```java
public class Animal {
    public Animal() {
        System.out.println("Создано животное");
    }
}

public class Dog extends Animal {
    public Dog() {
        super(); // вызывается автоматически, даже если не написать
        System.out.println("Создана собака");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
```
Результат:
```
Создано животное
Создана собака
```

---

## 🔹 Переопределение методов (Override)

Если у родителя и потомка есть метод с одинаковым именем и параметрами, потомок **переопределяет** поведение родителя.

```java
public class Animal {
    public void sound() {
        System.out.println("Животное издаёт звук");
    }
}

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}
```

Теперь при вызове `dog.sound()` выведется:
```
Собака лает
```

---

## 🔹 Вызов родительского метода

Иногда нужно не заменить, а **дополнить** поведение родителя.  
Тогда используется `super.methodName()`:

```java
public class BassGuitar extends Guitar {
    @Override
    public void play() {
        super.play(); // вызываем метод из Guitar
        System.out.println("Гитара ещё издаёт басы");
    }
}
```

Результат:
```
Гитара играет
Гитара ещё издаёт басы
```

---

## 🔹 Модификаторы доступа и наследование

| Модификатор | Видимость в потомках |
|--------------|----------------------|
| `public` | доступен везде |
| `protected` | доступен в потомках, даже из других пакетов |
| `default` (без слова) | доступен только в том же пакете |
| `private` | не наследуется |

---

## 🔹 Наследование в QA-проектах

### 🧠 Пример 1 — BaseTest
```java
public class BaseTest {
    @BeforeEach
    public void setUp() {
        System.out.println("Открываем браузер");
    }
}

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() {
        System.out.println("Проверяем вход");
    }
}
```

Результат:
```
Открываем браузер
Проверяем вход
```

---

### 🧠 Пример 2 — Page Object
```java
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }
}

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        System.out.println("Вводим логин и пароль");
        clickElement(By.id("submit"));
    }
}
```

---

## 🔹 Преимущества наследования

- Уменьшение дублирования кода  
- Централизованное обновление логики  
- Улучшение читаемости и структуры  
- Возможность расширять поведение без ломки старого кода

---

## ✅ Что нужно уметь после урока

- Понимать, что делает `extends`  
- Создавать иерархии классов  
- Использовать `super` для вызова конструктора или метода родителя  
- Переопределять (`@Override`) методы  
- Понимать, зачем наследование в тестовых фреймворках (BaseTest, BasePage)
