buildscript {
    repositories {
        google()
        mavenCentral()
    }

    //you can add project level plugins this scope
    dependencies {
        classpath(Dependencies.hiltAndroidGradlePlugin)
    }
}