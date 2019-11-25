export const multiply = (x: number, y: number) => x * y

// A curried function that can be partially applied is necessary for pointfree style.
export const curriedMultiply = (x: number) => (y: number) => x * y

// With pointful style it is necessary to explicitly specify the argument.
// console.log([1, 2, 3, 4, 5].map((x) => multiply(2, x))) // [2, 4, 6, 8, 10]

// With pointfree style the argument is implicitly applied.
// console.log([1, 2, 3, 4, 5].map(curriedMultiply(2))) // [2, 4, 6, 8, 10]