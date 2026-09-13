-- Слайд 7: Типы данных
-- 8 базовых типов, динамическая типизация — тип хранится у значения, не у переменной
-- Проверка типа: функция type(x)

print("=== Типы данных ===")

local a = nil
local b = true
local c = 42
local d = "hello"
local e = {1, 2, 3}
local f = function() end
local g = coroutine.create(function() end)

print(type(a)) --> nil
print(type(b)) --> boolean
print(type(c)) --> number
print(type(d)) --> string
print(type(e)) --> table
print(type(f)) --> function
print(type(g)) --> thread

-- userdata обычно приходит из C-библиотек, здесь просто для справки
print("userdata — данные, созданные и управляемые кодом на C")
