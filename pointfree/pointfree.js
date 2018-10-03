const multiply = (x, y) => x * y;

/**
 * A curried function that can be partially applied is necessary for pointfree style.
 */
const curriedMultiply = x => y => x * y;

/**
 * In a pointful scenario it is necessary to explicitly specify the parameter.
 */
console.log([12, 24, 5].map((x) => multiply(2, x))); // [24, 48, 10]

/**
 * In a pointfree scenario we do not care about the argument and let it be implicitly applied.
 */
console.log([12, 24, 5].map(curriedMultiply(2))); // [24, 48, 10]