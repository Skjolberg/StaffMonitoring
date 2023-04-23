rootProject.name = "StaffMonitoring"

sequenceOf(
    "common",
    "bungee",
    "velocity",
    "bukkit"
).forEach {
    include(it)
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
    }
}

