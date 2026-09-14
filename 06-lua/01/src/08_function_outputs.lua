-- Слайд 14: Выходные данные функций
-- Функция может вернуть несколько значений одновременно
-- Лишние возвращаемые значения отбрасываются
-- Недостающие значения становятся nil

print("=== Множественный return ===")
local function minmax(t)
  return math.min(table.unpack(t)), math.max(table.unpack(t))
end

local lo, hi = minmax({3, 1, 4, 1, 5})
print(lo, hi) --> 1 5

print("=== Отбрасывание лишних значений ===")
local function three()
  return 1, 2, 3
end
local only_first = three()
print(only_first) --> 1 (остальные отброшены)

print("=== Недостающие значения — nil ===")
local function two()
  return 1, 2
end
local x, y, z = two()
print(x, y, z) --> 1  2  nil
