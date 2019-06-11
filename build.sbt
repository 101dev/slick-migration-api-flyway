scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.11.12", "2.12.8")

organization := "io.github.nafg"

name := "slick-migration-api-flyway"

version := "0.6.0"

scalacOptions += "-deprecation"

libraryDependencies += "io.github.nafg" %% "slick-migration-api" % "0.6.1"

libraryDependencies += "org.flywaydb" % "flyway-core" % "5.2.4"

libraryDependencies += "com.h2database" % "h2" % "1.4.199" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

resolvers += Resolver.jcenterRepo

credentials ++= sys.env.get("BINTRAYKEY").toSeq.map(Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  "naftoligug",
  _
))

publishTo := Some("slick-migration-api-flyway @ bintray" at "https://api.bintray.com/maven/naftoligug/maven/slick-migration-api-flyway")
