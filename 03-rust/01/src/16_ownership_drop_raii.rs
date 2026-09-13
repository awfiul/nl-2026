// Cлайд 16: "Ownership ≈ RAII"
//
// Показывает, что drop() вызывается автоматически при выходе
// владельца из области видимости — как деструктор в C++ RAII.

struct Resource {
    name: String,
}

impl Drop for Resource {
    fn drop(&mut self) {
        println!("освобождаю ресурс: {}", self.name);
    }
}

fn main() {
    let _r1 = Resource { name: String::from("файл A") };
    {
        let _r2 = Resource { name: String::from("файл B") };
        println!("внутри внутреннего блока");
    } // <- _r2 уничтожается здесь, drop() вызывается автоматически

    println!("после внутреннего блока, до конца main");
} // <- _r1 уничтожается здесь
