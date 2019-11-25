export const add = (x: number, y: number): number => x + y;

export const curriedAdd = (x: number) => (y: number) => x + y;

// console.log("Non curried:", add(1, 2)) // "Non curried: 3"
// console.log("Curried:", curriedAdd(1)(2)) // "Curried: 3"