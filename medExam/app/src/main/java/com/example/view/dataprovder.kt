package com.example.mvcdemo.model

object DataProvider {
    fun getCourse(): Course {
        return Course(
            name = "Android Development",
            description = "Learn how to build Android apps using Kotlin.",
            duration = "6 weeks"
        )
    }
}
