/**
 * A higher order function is a function that takes a function as an argument.
 * Higher order functions can also return a function depending on it's use case.
 * This replaces the Strategy pattern from the OOP Design Patterns.
 * Higher order functions allow us to write more generic code and inject the specific details.
 */
const map = (fn, arr) => {
    const newArr = [];
    
    for (i = 0; i < arr.length; i++) {
        newArr.push(fn(arr[i]));
    }

    return newArr;
};

console.log(map(x => x + 5, [1, 2, 3, 4, 5])); // [6, 7, 8, 9, 10]