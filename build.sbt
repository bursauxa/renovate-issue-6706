val cucumberVersion = "6.2.0"

libraryDependencies ++= Seq(
  "io.cucumber" %% "cucumber-scala" % cucumberVersion % Test,
  "io.cucumber" % "cucumber-junit" % cucumberVersion % Test,
  "io.cucumber" % "cucumber-picocontainer" % cucumberVersion % Test
)