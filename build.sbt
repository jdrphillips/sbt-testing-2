scalaVersion := "2.13.2"

lazy val base = project.in(file("base")).settings(name := "base")
lazy val main = project.in(file("main")).settings(name := "main").dependsOn(base)
