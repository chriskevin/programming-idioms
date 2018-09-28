const add = (x, y) => x + y;

const curriedAdd = (x) => (y) => x + y;

add(1, 3);
curriedAdd(1)(3);

/* Preferably use a curry helper which is optimized */

import {curry} from 'ramda';

const add = curry((x, y) => x + y);

// This can be called both partially and with all arguments
add(1)(3); // This works
add(1, 3); // This works too