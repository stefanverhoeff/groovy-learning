import groovy.transform.*

@Canonical
//@ToString
//@EqualsAndHashCode
//@TupleConstructor
class Person {
    String first
    String last
    
    def getLast() {
        println "Got called!"
        return last
    }
    
    def setLast(String last) {
        println "Got set!"
        this.last = last
    }
    
//    String toString() {
//        "$first $last"
//    }
}

Person p1 = new Person(first: 'Sanna', last: 'Verhoeff')
Person p2 = new Person(first: 'Sanna', last: 'Verhoeff')
Person p3 = new Person(first: 'Robin', last: 'Verhoeff')
Person p4 = new Person('Stefan', 'Verhoeff')
//p.setFirst('Robin')
//p.last = 'Verhoeff'
//
println "${p1.getFirst()} ${p1.last}"
println p1
println p1 == p2
println p1 == p3

Set people = [p1, p2, p3, p4]
println people