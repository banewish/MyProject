name := "WebApi"

version := "0.1"

scalaVersion := "2.13.5"

val akkaVersion = "2.6.3"
val akkaHttpVersion = "10.1.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,

  "de.heikoseeberger" %% "akka-http-circe" % "1.36.0" excludeAll(ExclusionRule(organization = "de.heikoseeberger")),
  "io.circe" %% "circe-parser" % "0.13.0-RC1",
  "io.circe" %% "circe-generic" % "0.13.0-RC1",
  "org.scalatest" %% "scalatest" % "3.2.2"
)