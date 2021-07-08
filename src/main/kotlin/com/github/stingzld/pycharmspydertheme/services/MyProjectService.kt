package com.github.stingzld.pycharmspydertheme.services

import com.github.stingzld.pycharmspydertheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
