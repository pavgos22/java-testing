rootProject.name = "java-testing"
include("junit-testing")
include("java-stream")
include("java-rts")
include("java-rts:java-exception")
findProject(":java-rts:java-exception")?.name = "java-exception"
include("java-exception")
include("java-clean")
