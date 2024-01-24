# Individual Project Mykola Dudko

# Проект для тестування Kanboard
Проект створений для автоматизованого тестування програмного забезпечення для управління проектами – Kanboard.
Використовуються технології та бібліотеки, такі як testNG, Selenide, Rest Assured, Allure.

## Інструменти та Бібліотеки
Ваш проект використовує такі інструменти та бібліотеки:
- [Kanboard](посилання на сайт або документацію)

## Інструкції з встановлення та запуску
1. Клонуйте репозиторій:

    ```bash
    git clone git@github.com:Yroslavadudko/individualProjectMykolaDudko.git
    ```

2. Переконайтеся, що Docker встановлений на вашому пристрої.

3. Запустіть Kanboard у Docker:

    ```bash
    docker-compose up
    ```

   Після запуску, знайдіть пароль адміністратора у терміналі, де ви виконали команду `docker-compose up`.

4. Запустіть автоматизовані тести:

    ```bash
    mvn clean test
    ```

   Для того, щоб обрати, які тести ви хочете виконати, редагуйте конфігураційний файл.

## Інформація для тестування

- **Kanboard:** [http://localhost/login](http://localhost/login) або [http://127.0.0.1/login](http://127.0.0.1/login)
    - **Логін:** admin
    - **Пароль:** admin
    - **API ключ для API тестів:** Знаходиться в налаштуваннях -> API

- **Jenkins:** [http://localhost:8080](http://localhost:8080) (повинно перенаправити на [http://localhost:8080/login?from=%2F](http://localhost:8080/login?from=%2F))
    - **Пароль адміністратора:** Знаходиться в терміналі, де ви виконали команду `docker-compose up`.



