name := "scala-smfsb-examples"

version := "0.2-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature"
)

libraryDependencies  ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  //"org.scalanlp" %% "breeze" % "0.13.2",
  "org.scalanlp" %% "breeze-viz" % "0.13.2",
  //"org.scalanlp" %% "breeze-natives" % "0.13.2",
  "com.github.darrenjw" %% "scala-smfsb" % "0.5-SNAPSHOT"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at
    "https://oss.sonatype.org/content/repositories/releases/"
)

scalaVersion := "2.12.6"

scalaVersion in ThisBuild := "2.12.6" // for ensime


