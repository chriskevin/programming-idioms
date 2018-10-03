/**
 * This is the usual way you would reuse code to create more specific functionality from general functionality.
 *
 * const add = (x, y) => x + y;
 *
 * const inc = x => add(x, 1);
 */

const add = x => y => x + y;

/* Currying let's us leverage partial application which eliminates all the extra noise. */
const inc = add(1);

console.log("Applied second argument:", inc(2)); // "Applied second argument: 3"