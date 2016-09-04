import groovy.xml.*
import groovy.json.JsonOutput

String address = "Gabriel Max Straße 20 Berlin"
String format = 'xml'

def hereText = geoCode(address, format, 'HERE')
def googleText = geoCode(address, format, 'Google')

//println "HERE: $hereText"
//println "Google: $googleText"

def hereRoot = new XmlSlurper().parseText(hereText)
def hereLocation = hereRoot.Response.View.Result.Location.NavigationPosition
println "HERE: ${hereLocation.Latitude},${hereLocation.Longitude}"

def gRoot = new XmlSlurper().parseText(googleText)
def gLocation = gRoot.result[0].geometry.location
println "Google: ${gLocation.lat},${gLocation.lng}"

String geoCode(String address, String format = 'xml', String engine = 'HERE') {
    String appId = 'xv9hoY5IqzRaYdeSq8oF'
    String appCode = 'E8UqCDLW08dB0Rmlvp44kQ'
    String addressEncoded = URLEncoder.encode(address)
    Map urlForEngine = [
        HERE: "https://geocoder.cit.api.here.com/6.2/geocode.$format?app_id=$appId&app_code=$appCode&gen=9&searchtext=$addressEncoded",
        Google: "https://maps.googleapis.com/maps/api/geocode/$format?address=$addressEncoded"
    ]

    String output = urlForEngine[engine].toURL().text
    
    switch (format) {
        case 'xml':
            return XmlUtil.serialize(output)
        case 'json':
            return JsonOutput.prettyPrint(output)
        default:
            return output
    }
}