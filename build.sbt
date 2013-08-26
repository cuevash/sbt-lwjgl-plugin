sbtPlugin := true

scalaVersion := "2.10.2"

scalacOptions += "-deprecation"

name := "sbt-lwjgl-plugin-mod"

organization := "com.github.philcali"

version := "3.1.4"

libraryDependencies += "net.databinder" %% "dispatch-http" % "0.8.8"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>https://github.com/cuevash/sbt-lwjgl-plugin</url>
  <licenses>
    <license>
      <name>The MIT License</name>
      <url>http://www.opensource.org/licenses/mit-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:cuevash/sbt-lwjgl-plugin.git</url>
    <connection>scm:git:git@github.com:cuevash/sbt-lwjgl-plugin.git</connection>
  </scm>
  <developers>
    <developer>
      <id>philcali</id>
      <name>Philip Cali</name>
      <url>http://philcalicode.blogspot.com/</url>
    </developer>
  </developers>
)

publishTo <<= version { v =>
  if (v.trim.endsWith("SNAPSHOT"))
    Some(Resolver.file("file",  new File( "/Users/hector/ScalaWorkspace/cuevash-mvn-repo/snapshots" )) )
  else
  	Some(Resolver.file("file",  new File( "/Users/hector/ScalaWorkspace/cuevash-mvn-repo/releases" )) )
}

