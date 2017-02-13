name := "MyProject"
version := "1.0"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.1" withSources(),
  "org.scalatest" %% "scalatest" % "3.0.1" % "test" withSources()
)
