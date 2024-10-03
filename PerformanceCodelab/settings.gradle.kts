pluginManagement {
    repositories {
        mavenLocal()
        maven(url= "https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
        mavenCentral()
        maven(url= "https://maven.aliyun.com/repository/gradle-plugin")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        maven(url= "https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
        mavenCentral()
    }
}

rootProject.name = "ComposePerformanceCodelab"
include(":app")
include(":measure")
