pluginManagement {
    repositories {
        maven {
            setUrl("http://localhost:8081/repository/maven-public/")
            isAllowInsecureProtocol = true
        }
    }
}
dependencyResolutionManagement {
    repositories {
        maven {
            setUrl("http://localhost:8081/repository/maven-public/")
            isAllowInsecureProtocol = true
        }
    }
}

rootProject.name = "NexusDebugProj"
include(":app")
