-- Слайд 13: Входные данные функций
-- Позиционные параметры без строгой типизации
-- Значение по умолчанию эмулируется через or: local x = x or 10
-- Переменное число аргументов через ...

print("=== Значение по умолчанию через or ===")
local function greet(name)
  name = name or "гость"
  return "Привет, " .. name
end
print(greet())        --> Привет, гость
print(greet("Хакберди")) --> Привет, Хакберди

print("=== Переменное число аргументов (...) ===")
local function sum(...)
  local s = 0
  for _, v in ipairs({...}) do
    s = s + v
  end
  return s
end
print(sum(1, 2, 3))       --> 6
print(sum(1, 2, 3, 4, 5)) --> 15

print("=== select для доступа к varargs ===")
local function countArgs(...)
  return select("#", ...)
end
print(countArgs(1, "a", true, nil)) --> 4
