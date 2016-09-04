def qs = [limitTo: 'nerdy', firstName: 'Artemy', lastName: 'Tregubenko'].collect { name, value ->
    URLEncoder.encode(name) + "=" + URLEncoder.encode(value)
}.join('&')
def url = "http://api.icndb.com/jokes/random?$qs".toURL()
def joke = new groovy.json.JsonSlurper().parse(url).value.joke

println joke