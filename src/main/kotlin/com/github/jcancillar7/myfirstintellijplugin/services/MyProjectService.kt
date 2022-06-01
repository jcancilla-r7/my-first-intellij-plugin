package com.github.jcancillar7.myfirstintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jcancillar7.myfirstintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
