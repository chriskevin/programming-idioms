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
 * A simple compose function looks like this:
 * 
 * const compose = (f, g) => x => f(g(x));
 * 
 * Execution order is right to left. Why? Because math says so.
 * If you want left to right execution use a pipe function instead.
 * 
 * However Ramda has a compose function that can take n functions
 * as well as a pipe function that can take a list of functions.
 * 
 * So for this purpose we will assume that we use Ramdas compose.
 */

/**
 * Composition approach
 * This approach has no explicit state, is very readable
 * and also pointfree as an additional bonus.
 */
const nextCharForNumberString = compose(String.fromCharCode, inc, parseInt, trim);

/**
 * Alternative approach using Ramdas pipe function:
 * 
 * const nextCharForNumberString = pipe([trim, parseInt, inc, String.fromCharCode]);
 */

/**
 * You can also compose by calling map on a functor.
 */
const nextCharForNumberString = (str) =>
[str] // Of
    .map(trim)
    .map(parseInt)
    .map(inc)
    .map(String.fromCharCode)
    .reduce((acc, x) => x); // Fold
