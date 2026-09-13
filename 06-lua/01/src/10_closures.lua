-- Слайд 16: Замыкания
-- Функция «запоминает» переменные из внешней области видимости (upvalues)
-- Каждый вызов внешней функции создаёт новое, независимое замыкание
-- Используются для инкапсуляции состояния без классов

print("=== Простой счётчик через замыкание ===")
local function counter()
  local n = 0
  return function()
    n = n + 1
    return n
  end
end

local c = counter()
print(c(), c(), c()) --> 1 2 3

print("=== Независимость замыканий ===")
local c1 = counter()
local c2 = counter()
print(c1()) --> 1
print(c1()) --> 2
print(c2()) --> 1 (у c2 своё собственное n, не связано с c1)

print("=== Инкапсуляция состояния без классов ===")
local function makeAccount(balance)
  return {
    deposit = function(amount) balance = balance + amount end,
    withdraw = function(amount) balance = balance - amount end,
    getBalance = function() return balance end,
  }
end

local acc = makeAccount(100)
acc.deposit(50)
acc.withdraw(30)
print(acc.getBalance()) --> 120
