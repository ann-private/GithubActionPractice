// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}
fun getProperty(name: String): String {
    return System.getProperty(name) ?: System.getenv(name) ?:""
}
//val keyFile = file(getProperty("FILE_PATH"))
println("SIGNING_KEY: ${getProperty("SIGNING_KEY")}")
println("MY_PROPERTY: ${getProperty("MY_PROPERTY")}")