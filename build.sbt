ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

val ScalaTestDependency = "org.scalatest" %% "scalatest" % "3.2.11" % Test

lazy val root = (project in file("."))
  .settings(
    name := "ScalaBasicTraining",
    libraryDependencies ++= Seq(
      ScalaTestDependency)
  )