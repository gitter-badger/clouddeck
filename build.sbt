import AssemblyKeys._

organization  := "clouddeck"

version       := "0.1"

scalaVersion  := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.0"
  val sprayV = "1.3.1"
  Seq(
    "io.spray"            %   "spray-can"           % sprayV,
    "io.spray"            %   "spray-routing"       % sprayV,
    "io.spray"            %%  "spray-json"          % "1.2.6",
    "io.spray"            %   "spray-testkit"       % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"          % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"        % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"         % "2.3.7" % "test",
    "commons-io"          %   "commons-io"          % "2.4",
    "com.vmware"          %   "vijava"              % "5.1",
    "com.typesafe"        %%  "scalalogging-slf4j"  % "1.0.0",
    "org.slf4j"           %   "slf4j-api"           % "1.7.1",
    "ch.qos.logback"      %   "logback-classic"     % "1.0.7"
  )
}

assemblySettings

//jetty(port = 8686)

//tomcat(port = 8686)

Revolver.settings
