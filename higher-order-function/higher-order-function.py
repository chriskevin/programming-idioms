"""
 A higher order function is a function that takes a function as an argument.
 Higher order functions can also return a function depending on it's use case.
 This replaces the Strategy pattern from the OOP Design Patterns.
 Higher order functions allow us to write more generic code and inject the specific details.
"""

def filter(pred, xs):
    return [] if len(xs) == 0 else [xs[0]] + filter(pred, xs[1:]) if pred(xs[0]) else filter(pred, xs[1:])

# filter(lambda x: x % 2, [1, 2, 3, 4, 5]) # [1, 3, 5]