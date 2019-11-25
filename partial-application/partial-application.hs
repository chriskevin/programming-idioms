-- This is the usual way you would reuse code to create more specific functionality from general functionality.
--
-- add :: (Num a) => a -> a -> a
-- add x y = x + y
--
-- inc :: (Num a) => a -> a
-- inc x = add x 1

add :: (Num a) => a -> a -> a
add x y = x + y
 
-- Currying let's us leverage partial application.
inc :: (Num a) => a -> a
inc = add 1

-- inc 2 -- 3