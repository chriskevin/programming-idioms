"""
 A recursive function solves one part of the problem and then calls itself until
 it has exhaustively solved the entire problem.
  
 A recursive function requires a base case on which it terminates. Otherwise the function will
 create an infinite loop that consumes the entire call stack.
"""

def map(f, xs):
    return [] if len(xs) == 0 else [f(xs[0])] + map(f, xs[1:])

# map(lambda x: x * 2, [1, 2, 3, 4, 5])