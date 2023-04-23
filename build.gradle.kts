plugins {
    id("sm.java")
}

allprojects {
    plugins.apply("sm.java")

    group = "${project.property("group")}"
    version = "${project.property("version")}"
    description = "${project.property("description")}"
}

tasks {
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
        }
    }
    shadowJar {
        val libs = "me.davamu.libs"
        relocate("me.fixeddev", "$libs.cmdFlow")
        relocate("org.spongepowered.configurate", "$libs.configurate")
        relocate("net.shibacraft.library", "$libs.shibacraftLibrary")
        relocate("dev.triumphteam.gui", "$libs.triumphGui")

        arrayOf("bukkit", "bungee", "common", "velocity").forEach {
            val buildTask = project(":$it").tasks.named("shadowJar")
            dependsOn(buildTask)
            from(zipTree(buildTask.map {out -> out.outputs.files.singleFile}))
        }
        archiveFileName.set("${project.name}-${project.version}.jar")
        minimize()
    }
}