import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "OSMS"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    javaJpa,
     "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
   
    "com.google.code.geocoder-java" % "geocoder-java" % "0.15",
    "com.jamesmurty.utils" % "java-xmlbuilder" % "1.0",
    "commons-net" % "commons-net" % "3.3",
    "commons-io" % "commons-io" % "2.4",
    "org.apache.commons" % "commons-email" % "1.3.2",
    "net.sf.uadetector" % "distribution" % "2014.06",
	"org.apache.httpcomponents" % "httpclient" % "4.0-alpha4",
    "org.apache.httpcomponents" % "httpcore-nio" % "4.0-alpha5",
	"com.innoq.liqid" % "ldap-connector" % "1.3",
    "org.apache.httpcomponents" % "httpasyncclient" % "4.0-alpha3",
	"mysql" % "mysql-connector-java" % "5.1.16"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
