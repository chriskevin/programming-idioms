/* Here we conditionally extend a list. */

/**
 * The impure version has several problems.
 * 1) It is a lot more verbose than the pure and immutable version
 * and the additional details do not really provide any significant information.
 * So in this case they are just noise.
 * 2) The function mutates the list. Why is this bad you might ask?
 * What if the intent was to do two different transformations using the original list?
 * One of the functions is likely to operate on an inconsistent state.
 * 3) Running this function concurrently is a hazard since several threads could mutate the same list at the same time.
 * Not to mention the possibility of deadlocks or race conditions.
 * 4) Writing a unit test for an impure function, is not reliable.
 * The test will lie to you when it passes, since the function is called in a controlled isolated environment.
 * However when paired together with other functionality there is a undesired risk that application will start behaving
 * unexpectedly. In other words, your are just lucky if something does not break!
 */
const impureAddWhen = (pred, value, list) => {
    if (list.some(pred)) {
        list.push(value);
    }
    return list;
};

const pureAddWhen = (pred, value, list) =>
    list.some(pred) ? list.concat([value]) : list;
