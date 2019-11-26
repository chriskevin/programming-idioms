def inc(x):
  return x + 1

def double(x):
  return x * 2

# Util to compose two functions.
def compose(g, f):
  def c(x):
    return g(f(x))
  return c

# Util to pipe two functions.
def pipe(f, g):
    def c(x):
        return f(g(x))
    return c

# Util to compose more than two functions.
def composeN(*fns):
  def c(x):
    return reduce(lambda acc, fn: fn(acc), fns[::-1], x)
  return c

# Util to pipe more than two functions.
def pipeN(*fns):
  def c(x):
    return reduce(lambda acc, fn: fn(acc), fns, x)
  return c

# Nested approach to applying several functions.
# def incAndDouble(x):
#     return double(inc(x))

# Compose two functions using the compose utility to produce a new function.
incAndDouble = compose(double, inc)

# incAndDouble(2) # 6
