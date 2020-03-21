inc : number -> number
inc = (+) 1

double : number -> number
double = (*) 2

-- Nested approach to applying several functions.
-- incAndDouble : number -> number
-- incAndDouble x = double (inc x)

-- Haskell has an infix function for composition "."
incAndDouble : number -> number
incAndDouble = double << inc