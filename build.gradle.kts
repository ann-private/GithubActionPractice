// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}
fun getProperty(name: String): String {
    return System.getProperty(name) ?: System.getenv(name) ?:""
}
val keyFile = file(getProperty("FILE_PATH"))
println("Content of key.gpg: ${keyFile.path}")
println("FILE_PATH: ${getProperty("FILE_PATH")}")