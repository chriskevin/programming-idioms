-- In Haskell all functions are curried by default.
-- (+)(1)(2)
main :: IO ()
main = putStrLn . show $ (+)(1)(2)