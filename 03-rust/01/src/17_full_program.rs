// Слайд 14: "Маленькая программа целиком"

fn main() {
    let numbers = [1, 2, 3, 4, 5];

    for number in numbers {
        if number % 2 == 0 {
            println!("{number} is even");
        }
    }
}
