ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "com.scrabble"

lazy val scrabble = (project in file("."))
  .settings(
    name := "Scrabble",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
)
