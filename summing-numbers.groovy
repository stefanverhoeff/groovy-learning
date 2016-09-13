List nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]
assert nums.sum() == 36

// Java approach
int total
for (int n : nums) {
    total += n * 2
}
assert total == 72

// Groovy collect
assert 72 == nums.collect { it * 2 }.sum()

// Sum with a closure (equivalent to collect version)
assert 72 == nums.sum { it * 2 }

// Spread-dot
assert 72 == nums*.multiply(2).sum()

// Inject, simular to reduce
assert 72 == nums.inject(0) { acc, val ->
    acc + val * 2
}