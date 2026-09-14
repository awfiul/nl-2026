-- Слайд 11: Владение и передача владения
-- number / string / boolean / nil — передаются по значению (копия)
-- table / function — передаются по ссылке
-- Понятия «владения» как в Rust нет — за освобождение памяти отвечает сборщик мусора

print("=== Передача по значению (number) ===")
local function tryChangeNumber(n)
  n = n + 1000
end

local num = 5
tryChangeNumber(num)
print(num) --> 5 (не изменилось, была передана копия)

print("=== Передача по ссылке (table) ===")
local function change(t)
  t.x = 100
end

local a = {x = 1}
change(a)
print(a.x) --> 100 (изменилось, table передана по ссылке)

print("=== Две переменные — одна таблица ===")
local b = a
b.x = 999
print(a.x) --> 999 (a и b ссылаются на одну и ту же таблицу)
