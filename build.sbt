name := "SBTnew"

version := "0.1"

scalaVersion := "2.12.12"

lazy val common = project.in(file("common"))                                 //Common Module
  .settings(
    libraryDependencies ++= Seq("org.scalactic" %% "scalactic" % "3.2.9",   //adding Library dependency - "scalactic"//
      "org.scalaz" %% "scalaz-core" % "7.3.4",                              //"scalaz" dependency//
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,                      //Adding test dependency - "scalatest"//
      "org.mockito" %% "mockito-scala" % "1.16.37" % Test                   //"mockito dependency"//
    )
  )

lazy val rest = project.in(file("rest"))                                        //Adding another module - "rest"//
  .settings(
    libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.2.5",  //akka-http dependency//
      "com.typesafe.akka" %% "akka-stream" % "2.6.15",                          //akka-stream dependency//
      "com.typesafe.akka" %% "akka-actor" % "2.6.15",                           //akka-actor dependency//
      "org.json4s" %% "json4s-native" % "4.0.3",                                //json4s-native dependency//
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15" % Test,           //akka-stream-testkit dependency//
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.5" % Test,             //akka-http-testkit dependency//
      "com.typesafe.akka" %% "akka-testkit" % "2.6.15" % Test                   //akka-testkit dependency//

    )
  )

lazy val root = project.in(file(".")).aggregate(common, rest)