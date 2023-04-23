plugins {
    id("sm.essentials")
    id("sm.libbyBukkit")
    id("sm.configurate")
}

repositories {
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
}

dependencies {
    compileOnly(libs.spigot)
    compileOnly(libs.papi)
    compileOnly(libs.commandFlowBukkit)
}

tasks {
    processResources {
        filesMatching("plugin.yml") {
            expand(
                "name" to rootProject.name,
                "version" to project.version,
                "group" to project.group,
                "author" to project.property("author"),
                "description" to project.property("description"),
                "minecraftVersion" to project.property("minecraftVersion"),
            )
        }
    }
}