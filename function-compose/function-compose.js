// Imperative approach

const nextCharForNumberString = (str) => {
    const trimmed = str.trim();
    const number = parseInt(trimmed);
    const nextNumber = number + 1;
    return String.fromCharCode(nextNumber);
};

// Nested approach

const nextCharForNumberString = (str) => String.fromCharCode(parseInt(str.trim()) + 1);

// Using compose helper

import {compose, inc, trim} from 'ramda';

const nextCharForNumberString = compose(String.fromCharCode, inc, parseInt, trim);

// You can also compose by calling map on a functor

const nextCharForNumberString = (str) =>
[str] // Of
    .map((s) => s.trim())
    .map(parseInt)
    .map((n) => n + 1)
    .map((n) => String.fromCharCode(n))
    .reduce((acc, x) => x); // Fold