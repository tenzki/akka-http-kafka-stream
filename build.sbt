name := "akka-http-kafka-stream"

version := "1.0"

scalaVersion := "2.11.8"

organization in ThisBuild := "Bojan Babic"

val akka = "2.4.8"

libraryDependencies ++= {
  Seq(
    // akka
    "com.typesafe.akka"          %%  "akka-actor"                 % akka,
    "com.typesafe.akka"          %%  "akka-http-experimental"     % akka,
    "com.typesafe.akka"          %%  "akka-stream"                % akka,

    // kafka
    "com.typesafe.akka" %% "akka-stream-kafka" % "0.12"
  )
}
    