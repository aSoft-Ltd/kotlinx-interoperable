plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
}

description = "A workaround to export declarations in javascript without hurting the wasm modules"

kotlin {
    jvm { library() }
    if (Targeting.JS) js(IR) { library() } // untill https://youtrack.jetbrains.com/issue/KT-80014 gets fixed // untill https://youtrack.jetbrains.com/issue/KT-80014 gets fixed
    if (Targeting.WASM) wasmJs { library() }
    if (Targeting.WASM) wasmWasi { library() }
    val osxTargets = if (Targeting.OSX) osxTargets() else listOf()
    val ndkTargets = if (Targeting.NDK) ndkTargets() else listOf()
    val linuxTargets = if (Targeting.LINUX) linuxTargets() else listOf()
    val mingwTargets = if (Targeting.MINGW) mingwTargets() else listOf()
}