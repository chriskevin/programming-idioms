-- A recursive function solves one part of the problem and then calls itself until
-- it has exhaustively solved the entire problem.

-- A recursive function requires a base case on which it terminates. Otherwise the function will
-- create an infinite loop that consumes the entire call stack.

map : (a -> b) -> List a -> List b
map f list = 
    case list of
        [] -> []
        x::xs -> f x :: map f xs
