/**
 * A higher order function is a function that takes a function as an argument.
 * Higher order functions can also return a function depending on it's use case.
 * This replaces the Strategy pattern from the OOP Design Patterns.
 * Higher order functions allow us to write more generic code and inject the specific details.
 */
export const filter = (pred, [head, ...tail]) =>
    (head === undefined || head === null) ?
        [] :
        pred(head) ? [head].concat(filter(pred, tail)) : filter(pred, tail)

// console.log(filter(x => x % 2, [1, 2, 3, 4, 5])) // [1, 3, 5]
