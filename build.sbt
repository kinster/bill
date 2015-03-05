name := "skybill"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "info.cukes" % "cucumber-jvm" % "1.2.2",
  "info.cukes" % "cucumber-java" % "1.2.2",
  "info.cukes" % "cucumber-junit" % "1.2.2",
  "net.sourceforge.htmlunit" % "htmlunit" % "2.15",
  "org.skyscreamer" % "jsonassert" % "1.2.3"  
)     

play.Project.playJavaSettings
