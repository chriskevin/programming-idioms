# This is the usual way you would reuse code to create more specific functionality from general functionality.
#
# def add(x, y):
#     return x + y
#
# def inc(x):
#     return add(x, 1)

def add(x):
    def c1(y):
        return x + y
    return c1

# Since add is curried it will return a function expecting the next argument when one argument is applied.
inc = add(1)

# inc(2) # 3