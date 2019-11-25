def multiply(x, y):
    return x * y

# A curried function that can be partially applied is necessary for pointfree style.
def curriedMultiply(x):
    def c1(y):
        return x * y
    return c1

# With pointful style it is necessary to explicitly specify the argument.
# map(lambda x: multiply(2, x), [1, 2, 3, 4, 5]) # [2, 4, 6, 8, 10]

# With pointfree style the argument is implicitly applied.
# map(curriedMultiply(2), [1, 2, 3, 4, 5]) # [2, 4, 6, 8, 10]
