/**
 * The memoize function takes a function as an argument and returns a new function that is memoized.
 * This works by creating a closure containing a cache.
 * The first time the memoized function is called it will run the internal function to get a result.
 * When the function is called again with the same arguments it will get the result from the cache instead.
 */
const memoize = fn => {
    let cache = {};
    return (...args) => {
        const stringifiedArgs = JSON.stringify(args);
        const result = cache[stringifiedArgs] = cache[stringifiedArgs] || fn(...args);
        return result;
    };
};

const add = (x, y) => x + y;

const memoizedAdd = memoize(add);

console.log("First call will execute computation: ", memoizedAdd(5, 3)); // First call will execute computation: 8
console.log("Second call will use the cached value: ", memoizedAdd(5, 3)); // Second call will use the cached value:  8