inc :: (Num a) => a -> a
inc = (+1)

double :: (Num a) => a -> a
double = (*2)

-- Nested approach to applying several functions.
-- incAndDouble :: (Num a) => a -> a
-- incAndDouble x = double (inc x)

-- Haskell has an infix function for composition "."
incAndDouble :: (Num a) => a -> a
incAndDouble = double . inc
