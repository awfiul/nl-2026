-- Слайд 12: Функции: объявление и вызов
-- Функции — значения первого класса (тип function)
-- Можно объявлять именованные и анонимные функции
-- Хранятся в переменных, передаются как аргументы

print("=== Именованная функция ===")
local function greet(name)
  return "Hello, " .. name
end
print(greet("Lua"))

print("=== Анонимная функция ===")
local f = function(x)
  return x * 2
end
print(f(21)) --> 42

print("=== Функция как аргумент (функция первого класса) ===")
local function apply(fn, value)
  return fn(value)
end
print(apply(f, 10)) --> 20
print(apply(function(x) return x .. "!" end, "wow")) --> wow!
