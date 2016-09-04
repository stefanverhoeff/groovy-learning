def s = 'this is a string'
def s2 = "also a string ${s}"

s = "hello world"
println s[-1..0]
println s[0..4,6..-1]

def name = 'Sanna'
def greet = "Hello $name"

println greet

def multi = '''\
yay
more lines
please!
'''
println multi + multi.readLines()

def regexp = ~/\d{4}(-\d{4})?/
regexp.matcher("1233").matches()
"1234" ==~ regexp