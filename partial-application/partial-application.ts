/**
 * This is the usual way you would reuse code to create more specific functionality from general functionality.
 *
 * const add = (x: number, y: number) => x + y
 *
 * const inc = (x: number) => add(x, 1)
 */

export const add = (x: number) => (y: number) => x + y

// Currying let's us leverage partial application which eliminates all the extra noise.
export const inc = add(1)

// console.log("Applied second argument:", inc(2)) // "Applied second argument: 3"