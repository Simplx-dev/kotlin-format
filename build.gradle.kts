plugins {
    kotlin("jvm") version "1.5.31"
}

repositories {
    mavenCentral()
}

sourceSets {
    main {
        java.srcDir("src/main")
    }
    test {
        java.srcDir("src/test")
    }
}
dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
//    testImplementation(kotlin("test-testng"))
}