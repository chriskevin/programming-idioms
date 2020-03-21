-- This is the usual way you would reuse code to create more specific functionality from general functionality.
--
-- add : number -> number -> number
-- add x y = x + y
--
-- inc : number -> number
-- inc x = add x 1

add : number -> number -> number
add x y = x + y
 
-- Currying let's us leverage partial application.
inc : number -> number
inc = add 1

-- inc 2 -- 3