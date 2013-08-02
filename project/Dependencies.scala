import sbt._

object Dependencies {
  val nonStandardRepos = Seq(
    "Spray repo" at "http://repo.spray.io/",
    "Spray nightlies" at "http://nightlies.spray.io/"
  )

  def compile(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "compile")

  def provided(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "provided")

  def test(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "test")

  def runtime(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "runtime")

  def container(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "container")

  object V {
    val akka = "2.2.0"
    val spray = "1.2-20130727"
  }

  // Utilities
  val typesafeConfig = "com.typesafe" % "config" % "1.0.2"
  val scalalogging = "com.typesafe" %% "scalalogging-slf4j" % "1.1.0-SNAPSHOT"
  val jsonLenses = "net.virtual-void" %%  "json-lenses" % "0.5.3"

  // Spray
  val sprayCan = "io.spray" % "spray-can" % V.spray
  val sprayRouting = "io.spray" % "spray-routing" % V.spray
  val sprayCaching = "io.spray" % "spray-caching" % V.spray
  val sprayClient = "io.spray" % "spray-client" % V.spray

  // Akka
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % V.akka
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % V.akka

  // Logging
  val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.0.13"
}