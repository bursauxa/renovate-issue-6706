val cucumberVersion = "6.8.1"

libraryDependencies ++= Seq(
  "io.cucumber" %% "cucumber-scala" % cucumberVersion % Test,
  "io.cucumber" % "cucumber-junit" % cucumberVersion % Test,
  "io.cucumber" % "cucumber-picocontainer" % cucumberVersion % Test
)