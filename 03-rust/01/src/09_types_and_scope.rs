// Слайд 9: "Типы данных и область видимости"
//
// Скалярные типы: i32, f64, bool, char.
// Составные типы: tuple, array.
// Каждый блок { ... } создаёт свою область видимости.

fn main() {
    let x: i32 = 10;
    let pi: f64 = 3.14;
    let active: bool = true;
    let c: char = 'A';

    let pair: (i32, f64) = (10, 3.14);
    let numbers: [i32; 3] = [1, 2, 3];

    println!("x = {x}, pi = {pi}, active = {active}, c = {c}");
    println!("pair = {:?}, numbers = {:?}", pair, numbers);

    {
        let y = 20;
        println!("{y}");
    }
    // y здесь уже недоступна — следующая строка не скомпилируется:
    // println!("{y}");
}
