package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class LeePlugin : Plugin<Project> {

    override fun apply(project: Project) {

        project.plugins.apply("kotlin-android")
        project.plugins.apply("kotlin-kapt")
        project.plugins.apply("jacoco")
        project.plugins.apply("com.srcclr.gradle")
        project.plugins.apply("kotlin-parcelize")
    }
}