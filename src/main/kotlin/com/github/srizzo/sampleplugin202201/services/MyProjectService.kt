package com.github.srizzo.sampleplugin202201.services

import com.intellij.openapi.project.Project
import com.github.srizzo.sampleplugin202201.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
