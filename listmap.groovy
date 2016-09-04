Range r=1..10
println r

List nums = [8,1,2,4,5,3,2]
println nums
println nums.class.name
println ((nums - 2) * 2)
println (nums + 2 + 5 + [8, 9, 0])

def map = [a: 1, b: 42, c: 8]
map.d = 'yay'
println map
println map["b"]
println map.c
println map.d
println map.getClass().name

def s = [3,1,4,1,5,9,2,6,5] as Set
println s
println s.class.name

List strings = 'this is a list of strings'.split(/\s+|i/)
println strings
println strings.class.name

List<Integer> ints = [3,1,4,1,5,9] as List<Integer>
// Generics not enforced!!
ints << 'yay'
println ints
println ints.class.name