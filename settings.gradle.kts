rootProject.name = "java-testing"
include("junit-testing")
include("java-rts")
include("java-rts:java-exception")
findProject(":java-rts:java-exception")?.name = "java-exception"
include("java-exception")
include("java-clean")
include("java-spring")
include("java-spring-web")