val feeds1 = Set("blog.toolshed.com", "pragdave.pragprog.com", "pragmatic-osxer.blogspot.com", "vita-contemplativa.blogspot.com")
val feeds2 = Set("blog.toolshed.com", "martinflower.com/bliki")

val blogspotFeeds = feeds1 filter (_ contains "blogspot")
println("blogspot feeds: " + blogspotFeeds.mkString(", "))

val mergedFeeds = feeds1 ++ feeds2
println("# of feeds: " + mergedFeeds.size)

val commonFeeds = feeds1 & feeds2
println("common feeds: " + commonFeeds.mkString(", "))

val urls = feeds1 map ( "http://" + _)
println(urls)
println("One url: " + urls.toArray.toString())

println("Refresh Feeds:")
feeds1 foreach { feed => println(" Refreshing " + feed)}
