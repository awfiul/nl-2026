// Слайд 13: "Функции и рекурсия"

fn add(a: i32, b: i32) -> i32 {
    a + b
}

fn factorial(n: u32) -> u32 {
    if n == 0 {
        1
    } else {
        n * factorial(n - 1)
    }
}

fn main() {
    let result = add(2, 3);
    println!("add(2, 3) = {result}");

    println!("factorial(5) = {}", factorial(5));
}
