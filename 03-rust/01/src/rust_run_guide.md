# Rust: подробная инструкция по запуску программы

Документ описывает три способа запуска простой программы на Rust:

1. локальное окружение;
2. онлайн-среда Rust Playground;
3. Docker.

Во всех трёх случаях мы запускаем одну и ту же программу:

```rust
fn main() {
    println!("Hello, Rust!");
}
```

> **Важно:** для обычной разработки рекомендуется локальное окружение с `rustup` + `Cargo`. Онлайн-среда удобна для коротких примеров, а Docker — для изолированного и воспроизводимого окружения.

---

# 1. Локальное окружение

## 1.1. Что нужно установить

Для работы с Rust локально нужны:

- Rust toolchain — набор инструментов языка Rust;
- `rustc` — компилятор Rust;
- `cargo` — система сборки и менеджер пакетов;
- `rustup` — инструмент установки и управления версиями Rust.

Устанавливать их по отдельности не требуется.

Официальный способ установки — через `rustup`.

Официальная страница Rust:

https://rust-lang.org/tools/install/

Официальная документация Cargo:

https://doc.rust-lang.org/cargo/

---

## 1.2. Установка на Windows

### Шаг 1. Открыть официальный сайт Rust

Перейти:

https://rust-lang.org/tools/install/

На странице выбрать установщик для Windows.

Для обычного современного компьютера с процессором x86-64 нужен:

`rustup-init.exe (x64)`

Также доступны варианты для 32-bit и ARM64.

### Шаг 2. Запустить установщик

Запустить скачанный файл:

```text
rustup-init.exe
```

Откроется консольное окно установщика.

В большинстве случаев достаточно выбрать стандартный вариант установки:

```text
1) Proceed with installation (default)
```

Нажать `1` и Enter.

### Шаг 3. Установка компонентов

`rustup` установит:

- Rust compiler (`rustc`);
- Cargo (`cargo`);
- стандартную библиотеку Rust;
- сам `rustup`.

На Windows Rust также может потребовать инструменты C++ от Microsoft Visual Studio.

Если установщик сообщает, что отсутствуют необходимые C++ Build Tools, их нужно установить.

Официальная страница Microsoft Visual Studio:

https://visualstudio.microsoft.com/

Для Rust обычно достаточно установить **Build Tools for Visual Studio** с компонентами C++.

После установки C++ Build Tools при необходимости снова запустить `rustup-init.exe`.

---

## 1.3. Проверка установки на Windows

Открыть новое окно:

- PowerShell;
- Command Prompt;
- Windows Terminal.

Выполнить:

```powershell
rustc --version
```

Должна появиться информация о версии компилятора, например:

```text
rustc 1.xx.x (...)
```

Проверить Cargo:

```powershell
cargo --version
```

Проверить rustup:

```powershell
rustup --version
```

Если все три команды работают, локальное окружение установлено.

---

## 1.4. Установка на Linux или WSL

Если используется Linux или WSL, открыть терминал.

Официальная команда установки Rust:

```bash
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
```

Установщик предложит выбрать вариант установки.

Для стандартной установки выбрать вариант по умолчанию.

После завершения установки может потребоваться перезапустить терминал.

Проверить:

```bash
rustc --version
```

```bash
cargo --version
```

```bash
rustup --version
```

Официальная инструкция:

https://rust-lang.org/tools/install/

---

## 1.5. Установка на macOS

Открыть Terminal.

Установить Rust:

```bash
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
```

Следовать инструкциям установщика.

После установки проверить:

```bash
rustc --version
```

```bash
cargo --version
```

Официальная инструкция:

https://rust-lang.org/tools/install/

---

# 2. Создание первого проекта

После установки Rust проект лучше создавать через Cargo.

Cargo автоматически создаёт структуру проекта, файл конфигурации и исходный файл программы.


---

## Шаг 1. Создать проект

Выполнить:

```bash
cargo new hello_rust
```

Cargo создаст новый бинарный проект.

После этого появится структура:

```text
hello_rust/
├── Cargo.toml
└── src/
    └── main.rs
```

`Cargo.toml` — файл описания проекта.

`src/main.rs` — исходный файл основной программы.

Официальная документация:

https://doc.rust-lang.org/cargo/commands/cargo-new.html

---

## Шаг 3. Перейти в проект

```bash
cd hello_rust
```

---

## Шаг 4. Посмотреть созданную программу

Открыть:

```text
src/main.rs
```

Cargo уже создаст там:

```rust
fn main() {
    println!("Hello, world!");
}
```

Заменить программу, например, на:

```rust
fn main() {
    println!("Hello, Rust!");
}
```

---

# 3. Сборка и запуск локальной программы

## Вариант 1. `cargo run`

Самый простой способ:

```bash
cargo run
```

Cargo:

1. находит проект;
2. читает `Cargo.toml`;
3. компилирует исходный код;
4. создаёт исполняемый файл;
5. запускает программу.

Результат:

```text
Hello, Rust!
```

---

## Вариант 2. Отдельно собрать программу

```bash
cargo build
```

После этого исполняемый файл находится в:

```text
target/debug/
```

Для Windows это будет примерно:

```text
target/debug/hello_rust.exe
```

Для Linux/macOS:

```text
target/debug/hello_rust
```

---

## Вариант 3. Сборка release-версии

Для оптимизированной сборки:

```bash
cargo build --release
```

Результат появится в:

```text
target/release/
```

Запустить release-версию можно непосредственно из этой директории.

---

# 4. Что происходит при `cargo run`

Когда выполняется:

```bash
cargo run
```

происходит примерно следующая цепочка:

```text
main.rs
   ↓
Cargo
   ↓
rustc
   ↓
машинный код
   ↓
исполняемый файл
   ↓
запуск программы
```

Cargo сам вызывает компилятор `rustc` и управляет процессом сборки.

Поэтому пользователю обычно не нужно вручную выполнять `rustc main.rs`.

Cargo также управляет зависимостями проекта и каталогом сборки.

---

# 5. Онлайн-среда Rust Playground

## 5.1. Что нужно устанавливать

**Ничего.**

Не нужно устанавливать:

- Rust;
- Cargo;
- `rustc`;
- IDE;
- Docker.

Нужен только современный веб-браузер.

Официальный Rust Playground:

https://play.rust-lang.org/

---

## 5.2. Запуск программы

### Шаг 1. Открыть Rust Playground

Перейти:

https://play.rust-lang.org/

Откроется редактор с примером программы:

```rust
fn main() {
    println!("Hello, world!");
}
```

### Шаг 2. Изменить программу

Например:

```rust
fn main() {
    println!("Hello, Rust!");
}
```

### Шаг 3. Нажать `Run`

Playground отправляет программу на сервер для компиляции и запуска.

В результате появится:

```text
Hello, Rust!
```

---

## 5.3. Что происходит внутри Playground

Упрощённая схема:

```text
Код в браузере
      ↓
Rust Playground
      ↓
компиляция на сервере
      ↓
запуск
      ↓
результат возвращается в браузер
```

Таким образом, компилятор Rust не должен быть установлен на компьютере пользователя.

---

## 5.4. Для чего подходит Playground

Rust Playground особенно удобен для:

- демонстрации синтаксиса;
- коротких программ;
- проверки небольших фрагментов кода;
- экспериментов;
- учебных примеров.

Для большого проекта полноценное локальное окружение обычно удобнее.

---

# 6. Запуск Rust через Docker

Docker позволяет запускать Rust внутри контейнера.

В этом случае Rust toolchain находится внутри Docker-образа.

---

# 8. Запуск Rust-контейнера

Docker предоставляет официальный образ Rust.

Официальный образ:

https://hub.docker.com/_/rust/

Он поддерживается Rust Project developers.

## Шаг 1. Скачать официальный образ Rust

Выполнить:

```bash
docker pull rust
```

Docker скачает официальный Rust image.

Можно также использовать конкретный тег, например:

```bash
docker pull rust:latest
```

Для воспроизводимых окружений лучше фиксировать конкретную версию или тег.

---

## Шаг 2. Запустить контейнер

```bash
docker run -it --rm rust
```

Параметры:

- `docker run` — создать и запустить контейнер;
- `-it` — открыть интерактивный терминал;
- `--rm` — удалить контейнер после завершения;
- `rust` — использовать официальный образ Rust.

После запуска мы окажемся внутри контейнера.

---

## Шаг 3. Проверить Rust внутри контейнера

Выполнить:

```bash
rustc --version
```

Затем:

```bash
cargo --version
```

Rust и Cargo работают внутри контейнера.

---

# 9. Создание программы внутри Docker

Находясь внутри контейнера:

```bash
cargo new hello_rust
```

Перейти в проект:

```bash
cd hello_rust
```

Запустить:

```bash
cargo run
```

Получим:

```text
Hello, world!
```

Можно изменить `src/main.rs` и снова выполнить:

```bash
cargo run
```

---

# 10. Важная проблема простого Docker-примера

Команда:

```bash
docker run -it --rm rust
```

создаёт временный контейнер.

Если выйти из контейнера, он будет удалён из-за:

```text
--rm
```

Поэтому проект, созданный только внутри контейнера, не следует рассматривать как нормальный способ хранения исходного кода.

Для реальной разработки исходники обычно находятся **на компьютере пользователя**, а контейнер используется как окружение для сборки и запуска.

---

# 11. Запуск локального проекта через Docker

Допустим, на компьютере уже существует проект:

```text
hello_rust/
├── Cargo.toml
└── src/
    └── main.rs
```

Можно подключить эту папку внутрь контейнера.

## Linux/macOS

Из директории проекта:

```bash
docker run --rm -it -v "$PWD":/app -w /app rust cargo run
```

## Windows PowerShell

Из директории проекта:

```powershell
docker run --rm -it -v "${PWD}:/app" -w /app rust cargo run
```

Здесь:

- `-v` подключает папку проекта внутрь контейнера;
- `/app` — путь к проекту внутри контейнера;
- `-w /app` устанавливает рабочую директорию;
- `cargo run` запускается внутри контейнера.

Схема:

```text
Компьютер
│
└── hello_rust/
    │
    ├── Cargo.toml
    └── src/
        └── main.rs
             │
             │ volume mount
             ↓
Docker container
│
└── /app/
    ├── Cargo.toml
    └── src/
        └── main.rs
             │
             ↓
          cargo run
             │
             ↓
          rustc
```

Официальный Docker-образ Rust также описывает использование volume mount для сборки проекта внутри контейнера.

---

# 12. Более практичный вариант Docker: Dockerfile

Для полноценного проекта можно создать файл:

```text
Dockerfile
```

Внутри:

```dockerfile
FROM rust:latest

WORKDIR /app

COPY . .

RUN cargo build --release

CMD ["cargo", "run", "--release"]
```

Структура:

```text
hello_rust/
├── Cargo.toml
├── Dockerfile
└── src/
    └── main.rs
```

---

## Сборка Docker-образа

В директории проекта:

```bash
docker build -t hello-rust .
```

Здесь:

- `docker build` — собрать образ;
- `-t hello-rust` — задать имя образа;
- `.` — использовать текущую директорию как контекст сборки.

---

## Запуск

```bash
docker run --rm hello-rust
```

Программа выполнится внутри контейнера.

---

# 13. Сравнение трёх способов

| Способ | Что устанавливаем | Где компилируется | Для чего удобно |
|---|---|---|---|
| Локально | Rust + Cargo | На компьютере | Полноценная разработка |
| Rust Playground | Ничего | На сервере Playground | Учебные примеры |
| Docker | Docker Desktop | В контейнере | Изоляция и воспроизводимость |

---

# 14. Что выбрать для презентации

Для демонстрации базового Rust лучше использовать **локальный вариант**:

```text
rustup
  ↓
Rust + Cargo
  ↓
cargo new
  ↓
src/main.rs
  ↓
cargo run
  ↓
программа
```

Он лучше всего показывает обычный жизненный цикл программы на Rust.

Для сравнения можно показать:

```text
Локально
Rust установлен на компьютере
        ↓
      cargo
        ↓
     rustc
        ↓
     программа


Онлайн
Браузер
   ↓
Rust Playground
   ↓
удалённая компиляция
   ↓
результат


Docker
Docker Desktop
      ↓
Rust container
      ↓
Cargo + rustc
      ↓
программа
```

---

# 15. Официальные источники

### Rust

Официальный сайт:

https://rust-lang.org/

Установка Rust:

https://rust-lang.org/tools/install/

Русская версия инструкции по установке:

https://rust-lang.org/ru/tools/install/

### Cargo

Официальная документация:

https://doc.rust-lang.org/cargo/

Первые шаги:

https://doc.rust-lang.org/cargo/getting-started/first-steps.html

Создание проекта:

https://doc.rust-lang.org/cargo/commands/cargo-new.html

### Rust Playground

https://play.rust-lang.org/

Документация Playground:

https://play.rust-lang.org/help

### Docker

Docker Desktop:

https://www.docker.com/products/docker-desktop/

Установка Docker Desktop на Windows:

https://docs.docker.com/desktop/setup/install/windows-install/

Официальный образ Rust:

https://hub.docker.com/_/rust/


