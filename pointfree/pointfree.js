// In a pointful scenario it is necessary to explicitly specify the parameter
[{id: 12}, {id: 24}, {id: 5}].filter((x) => propEq(24, x));

// If propEq is curried we can use partial application, thus making the paramter implicit

[{id: 12}, {id: 24}, {id: 5}].filter(propEq(24));