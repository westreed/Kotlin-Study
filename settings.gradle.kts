
rootProject.name = "Kotlin-Study"
include("src:main:Java")
findProject(":src:main:Java")?.name = "Java"
