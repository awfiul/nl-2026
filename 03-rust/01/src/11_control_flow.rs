// Слайд 11: "Условия и циклы"
//
// if/else, loop, while, for — и loop как выражение.

fn main() {
    let condition = true;

    if condition {
        println!("if: condition истинно");
    } else {
        println!("if: condition ложно");
    }

    let result = if condition {
        10
    } else {
        20
    };

    println!("Полученный результат: {result}");

    let mut count = 0;
    loop {
        count += 1;
        if count == 3 {
            break;
        }
    }
    println!("loop остановлен на count = {count}");

    let mut n = 0;
    while n < 3 {
        println!("while: n = {n}");
        n += 1;
    }

    for i in 0..5 {
        println!("{i}");
    }

    // loop — тоже выражение: может вернуть значение через break
    let result = loop {
        break 42;
    };
    println!("result = {result}");

    {
        let numbers = vec![1, 2, 3];

        for x in numbers {
            println!("{x}");
        }

        // numbers больше нельзя использовать
        // println!("{}", numbers[0]); // ошибка "value borrowed here after move"
    }

    {
        let numbers = vec![1, 2, 3];

        for x in numbers.iter() {
            println!("{x}");
        }

        println!("{numbers:?}"); // Без ошибок, так как получили просто ссылки без владения
    }

    {
        // получаем изменяемые ссылки
        let mut numbers = vec![1, 2, 3];

        for x in numbers.iter_mut() {
            *x *= 2;
        }

        println!("{numbers:?}");
    }
}
