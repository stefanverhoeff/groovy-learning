List strings = "this is a list of strings".split()

println strings

// Natural order
Collections.sort(strings)
println strings

// By length, 2 param
strings.sort { a, b ->
    return a.size() <=> b.size()
}
println strings

// By length, 1 param
println strings.sort(false) { 0-it.size() }