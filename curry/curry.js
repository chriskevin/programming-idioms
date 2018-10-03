const add = (x, y) => x + y;

const curriedAdd = (x) => (y) => x + y;

console.log("Non curried:", add(1, 2)) // "Non curried: 3"
console.log("Curried:", curriedAdd(1)(2)) // "Curried: 3"