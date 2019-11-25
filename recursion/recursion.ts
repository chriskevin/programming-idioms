/**
 * A recursive function solves one part of the problem and then calls itself until
 * it has exhaustively solved the entire problem.
 * 
 * A recursive function requires a base case on which it terminates. Otherwise the function will
 * create an infinite loop that consumes the entire call stack.
 */

export const map = (f: Function, [head, ...tail]: Array<any>): Array<any> =>
  (head === undefined || head === null) ?
    [] :
    [f(head)].concat(map(f, tail))

// console.log(map((x: number) => x * 2, [0, 1, 2, 3, 4, 5]))