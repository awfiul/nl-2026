// Cлайд 15: "Ownership: как Rust управляет значениями"

fn main() {
    let s1 = String::from("hello");
    let s2 = s1; // move: владение переходит от s1 к s2

    // println!("{s1}"); // ошибка компиляции: value borrowed after move
    println!("{s2}");
}
