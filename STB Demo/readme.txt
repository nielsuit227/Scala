-- touch build.sbt:
-- sbt

create src/main/scala/packageName 
--> with content
```
package hello

object Hello extends App {
    println("Hello, world!")
}
```


fill build.sbt
```
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.amplo"

lazy val hello = (project in file("."))
    .settings(
        name := "Hello",
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.2" % Test,
    )
```
Scala dependencies from: 
https://mvnrepository.com/