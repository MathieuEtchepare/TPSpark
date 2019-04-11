package com.tp.spark.utils

import com.google.gson._
	
object TweetUtils {
	case class Tweet (
		id : String,
		user : String,
		text : String,
		place : String,
		country : String,
		lang : String
		)

	
	def parseFromJson(lines:Iterator[String]):Iterator[Tweet] = {
		val gson = new Gson
		lines.map(line => gson.fromJson(line, classOf[Tweet]))
	}
}

{"busId": 3, "fuel": 0, "seats": 50, "passengers": 65, "line": 1, "nextStop": 1, "nextStopDistance": 767, "totalKms": 250233, "broken": true, "weather": "hot", "country": { "name": "France", "northHemisphere": true }}
