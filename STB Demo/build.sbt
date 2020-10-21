ThisBuild / scalaVersion := "2.13.3"
ThisBuild / organization := "com.amplo"

lazy val hello = (project in file("."))
    .settings(
        name := "Hello",
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test,
    )