-- In Elm pointfree style is very common
pointfree = List.map ((*) 2) (List.range 1 5) -- [2, 4, 6, 8, 10]

-- While the pointful style creates more noise
pointful = List.map (\n -> n * 2) (List.range 1 5) -- [2, 4, 6, 8, 10]