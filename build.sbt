name := "play2-crud-mysql"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "play2-crud" % "play2-crud_2.10" % "0.7.3-SNAPSHOT" exclude("com.typesafe.play", "play-cache_2.10")
)     

resolvers += "hakandilek release" at "http://hakandilek.github.com/maven-repo/releases/"

resolvers += "hakandilek snapshots" at "http://hakandilek.github.com/maven-repo/snapshots/"

play.Project.playJavaSettings
