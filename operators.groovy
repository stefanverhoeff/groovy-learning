// Safe navigation
class Department {
    Manager boss
}

class Manager {
    String name
}

Department dep = new Department(boss: new Manager(name: "Mr Burns"))
println dep.boss.name

Department dep2

// NPE:
//println dep2.boss.name

// Safe!
println dep2?.boss?.name

// Spaceship
int x=3, y=6, z=8
println x <=> y
println y <=> y
println z <=> y

// Elvis
def name = ''
println "Hello " + (name ?: 'world')

// Spread dot
def names = ['Robin', 'Laurens', 'Gerben']
println names*.toUpperCase()