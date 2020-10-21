ThisBuild / scalaVersion := "2.13.3"
ThisBuild / organization := "com.amplo"
ThisBuild / version := "1.0.0"

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"
val playJson = "com.typesafe.play" %% "play-json" % "2.9.1"
val gigahorse = "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.0"

lazy val Hello = (project in file("."))
    .aggregate(HelloCore)
    .dependsOn(HelloCore)
    .settings(
        name := "Hello",
        libraryDependencies += scalaTest % Test,
    )

lazy val HelloCore = (project in file("core"))
    .settings(
        name := "Hello Core",
        libraryDependencies += scalaTest % Test,
        libraryDependencies ++= Seq(gigahorse, playJson),
    )