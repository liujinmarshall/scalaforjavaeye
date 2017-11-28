val feeds = List("blog.toolshed.com", "pragdave.pragprog.com", "dimsumthinking.com/blog")

println("First feed: " + feeds.head)
println("Second feed: " + feeds(1))

val prefixedList = "forums.pragprog.com/forums/87" :: feeds
println("First Feed In Prefixed: " + prefixedList.head)

val feedsWithForums = feeds ::: List("forums.pragprog.com/forum/87", "forums.pragprog.com/forums/55")
println("First feed in feeds with forum: " + feedsWithForums.head)
println("Last feed in feeds with forum: " + feedsWithForums.last)

val appendedList = feeds ::: List("agiledeveloper.com/blog")
println("Last Feed In Appended: " + appendedList.last)

println("Feeds with blog: " + feeds.filter( _ contains "blog" ).mkString(", "))
println("All feeds have com: " + feeds.forall( _ contains "com"))
println("All feeds have dave: " + feeds.forall(_ contains "dave"))
println("Any feed has dave: " + feeds.exists( _ contains "dave"))
println("Any feed has bill: " + feeds.exists(_ contains "bill"))

println("Feed url length: " + feeds.map(_.length).mkString(", "))

val total = feeds.foldLeft(0) { (total, feed) => total + feed.length }
println("Total length of feed urls: " + total)

val total2 = (0 /: feeds) { (total, feed) => total + feed.length }
println("Total length of feed urls: " + total2)

val total3 = (0 /: feeds) { _ + _.length}
println("Total length of the feed urls: " + total3)
