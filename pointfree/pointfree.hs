-- In Haskell pointfree style is very common
let pointfree = map (*2) [1..5] -- [2, 4, 6, 8, 10]

-- While the pointful style creates more noise
let pointful = map (\n -> n * 2) [1..5] -- [2, 4, 6, 8, 10]