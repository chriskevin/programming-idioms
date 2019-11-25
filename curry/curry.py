def add(x, y):
    return x + y

def curriedAdd(x):
    def c1(y):
        return x + y
    return c1

# add(1, 2)
# add(1)(2)