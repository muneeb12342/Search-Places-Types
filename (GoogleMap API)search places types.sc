
val url = "https://maps.googleapis.com/maps/api/place/textsearch/xml?query=banks+in+Sargodha&key=AIzaSyCusQdKq6XQTPGUwXOTwXuDHhOnzDpODSo"
val result = scala.io.Source.fromURL(url).mkString
println(result)
