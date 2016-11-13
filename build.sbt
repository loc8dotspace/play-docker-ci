
name := "play-docker-ci"

version := "1.1"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
