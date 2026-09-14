// Слайд 14: "Обработка ошибок"
//
// panic! — невосстановимая ошибка.
// assert! / assert_eq! — проверка предположений (тоже паникуют при провале).

fn might_panic(value: i32) {
    if value < 0 {
        panic!("value must be non-negative, got {value}");
    }
    println!("value = {value}");
}

fn main() {
    let a = 4;
    let b = 2 * 2;

    assert!(a > 0);
    assert_eq!(a, b);
    println!("assert! и assert_eq! прошли успешно");

    might_panic(5);

    // Раскомментируйте, чтобы увидеть panic! в действии
    // (программа завершится с ненулевым кодом):
    // might_panic(-1);
}
