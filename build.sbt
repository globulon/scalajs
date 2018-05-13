scalaVersion := "2.12.5"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.5"
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"

skip in packageJSDependencies := false
jsDependencies +=
"org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

testFrameworks += new TestFramework("utest.runner.Framework")