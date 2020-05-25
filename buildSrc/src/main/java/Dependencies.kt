object Versions {
    val compileSdk = 29
    val targetSdk = 29
    val minSdk = 19
    val buildTools = "29.0.3"
    val kotlin = "1.3.72"
    val appcompat = "1.1.0"
    val core_ktx = "1.2.0"
    val constraintlayout = "1.1.3"
    val junit = "4.13"
    val test_ext_junit = "1.1.1"
    val espresso_core = "3.2.0"
}

object Dependencies {
    val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val junit = "junit:junit:${Versions.junit}"
    val test_ext_junit = "androidx.test.ext:junit:${Versions.test_ext_junit}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}
