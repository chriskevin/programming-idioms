/* Regular function */
function regularFn(x) {
    return x + x
}

/* Lambda */
const lambdaFn = x => x + x;

console.log(regularFn(2)) // 4
console.log(lambdaFn(4)) // 8