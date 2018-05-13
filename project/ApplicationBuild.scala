import com.typesafe.sbt.packager.archetypes.JavaServerAppPackaging
import org.scalajs.sbtplugin.ScalaJSPlugin
import sbt.Keys._
import sbt._

import scala.language.{higherKinds, implicitConversions, postfixOps}

object ApplicationBuild extends Build with BuildSettings
  with Resolvers with Versions with Dependencies with TestDependencies {
  lazy val mailingService: Project = Project(
    "play-scala-js",
    file("."),
    settings = buildSettings ++
      Seq(resolvers ++= repos) ++
      Seq(libraryDependencies ++= Seq(scalaz, scalaTesting % "test"))
  ).enablePlugins(JavaServerAppPackaging, ScalaJSPlugin)
}