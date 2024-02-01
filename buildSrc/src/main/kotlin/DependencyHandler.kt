import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.compose() {
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeRuntime)
    implementation(Dependencies.composeUiGraphics)
    implementation(Dependencies.composeUiTooling)
    implementation(Dependencies.composeMaterial)

}

fun DependencyHandler.androidx(){
    implementation(Dependencies.androidxCore)
    implementation(Dependencies.material)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.appCompat)
}
fun DependencyHandler.room() {
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomCompiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
}



fun DependencyHandler.hilt() {
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
}

fun DependencyHandler.testLibrary() {
    debugImplementation(Dependencies.composeUiToolingPreview)
    test(Dependencies.junit)
    androidTest(Dependencies.extJunit)
    androidTest(Dependencies.espresso)
}

fun DependencyHandler.yandexMap(){
    implementation(Dependencies.yandexMap)
}


/**
 * If you want to add a module as a library of another module,
 * you should write code like this
 */