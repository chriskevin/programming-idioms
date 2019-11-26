-- A higher order function is a function that takes a function as an argument.
-- Higher order functions can also return a function depending on it's use case.
-- This replaces the Strategy pattern from the OOP Design Patterns.
-- Higher order functions allow us to write more generic code and inject the specific details.
filter' :: (a -> Bool) -> [a] -> [a]
filter' _ [] = []
filter' pred (x:xs) = if pred x then x : filter pred xs else filter pred xs
