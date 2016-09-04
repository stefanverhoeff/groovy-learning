def nums = [3,1,4,1,5,9]

for (n in nums) {
    println n
}

nums.each { n ->
    println n
}

nums.eachWithIndex { n,i ->
    println "nums[$i] is $n"
}

Map m = [hi: "name", how: "you"]

m.each { key,val ->
    println "$key == $val"
}

10.downto(1, { println it }) // like Java
10.downto(1) { println it } // idiomatic