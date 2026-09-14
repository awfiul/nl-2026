-- Слайд 15: Рекурсия
-- Хвостовой вызов — когда рекурсивный вызов является последним действием функции;
-- такие вызовы Lua оптимизирует и не растит стек
-- Для рекурсии внутри себя — local function, а не local f = function

print("=== Обычная рекурсия (не хвостовая) ===")
local function fact(n)
  if n == 0 then return 1 end
  return n * fact(n - 1)
end
print(fact(5)) --> 120

print("=== Хвостовая рекурсия (с аккумулятором) ===")
local function factTail(n, acc)
  acc = acc or 1
  if n == 0 then return acc end
  return factTail(n - 1, n * acc)
end
print(factTail(5)) --> 120

-- Хвостовая рекурсия не растит стек, поэтому она безопасна для больших n
print(factTail(20))
