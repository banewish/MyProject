name := "JsonExamples"

version := "0.1"

scalaVersion := "2.13.5"

val circeVersion = "0.12.3"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % Test
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
libraryDependencies += "org.scalamock" %% "scalamock" % "5.1.0"
