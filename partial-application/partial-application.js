////
// Partial Application
////

// Partial application can be used for creating more specific functions

// Without partial application you would need use a wrapping function, creating additiional boilerplate

const inc = (x) => add(x, 1);

// With partial application you provide a subset of arguments and let the new function provide the last ones when called

const inc = add(1);

// Both variants are called like so

inc(3);