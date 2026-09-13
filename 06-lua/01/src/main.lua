-- main.lua — единая точка входа для демонстрации всех примеров презентации
-- Запуск: lua main.lua
-- Или через Docker: docker run --rm lua-app

local files = {
  "01_types",
  "02_operations",
  "03_typecast",
  "04_scope",
  "05_ownership",
  "06_functions",
  "07_function_inputs",
  "08_function_outputs",
  "09_recursion",
  "10_closures",
}

for _, name in ipairs(files) do
  print("\n########## " .. name .. " ##########\n")
  dofile(name .. ".lua")
end
