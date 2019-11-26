// Util to compose two functions.
const compose = (g, f) => x => g(f(x))

// Util to pipe two functions.
const pipe = (f, g) => x => f(g(x))

// Util to compose more than two functions.
const composeN = (...fns) => x => fns.reverse().reduce((acc, fn) => fn(acc), x)

// Util to pipe more than two functions.
const pipeN = (...fns) => x => fns.reduce((acc, fn) => fn(acc), x)

/**
 * Imperative approach
 * This adds a lot of explicit state that we are not interested in.
 */
const nextCharForNumberString = str => {
    const trimmed = str.trim();
    const number = parseInt(trimmed);
    const nextNumber = number + 1;
    return String.fromCharCode(nextNumber);
};

/**
 * Nested approach
 * This removes the explicit state but can be hard to read
 * since it is not entirely clear were the most nested part is.
 */
const nextCharForNumberString = str => String.fromCharCode(parseInt(str.trim()) + 1);

/**
 * Composition approach
 * This approach has no explicit state, is very readable
 * and also pointfree as an additional bonus.
 */
const nextCharForNumberString = composeN(String.fromCharCode, inc, parseInt, trim);

// You can also compose by calling map on a functor.
const nextCharForNumberString = (str) =>
[str] // Of
    .map(trim)
    .map(parseInt)
    .map(inc)
    .map(String.fromCharCode)
    .reduce((acc, x) => x); // Fold
    