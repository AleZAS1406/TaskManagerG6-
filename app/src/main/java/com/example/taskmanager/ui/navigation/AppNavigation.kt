package com.example.taskmanager.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taskmanager.ui.repository.TaskRepository
import com.example.taskmanager.ui.screen.AddTaskScreen
import com.example.taskmanager.ui.screen.TaskListScreen

@Composable
fun AppNavigation(
    repository: TaskRepository,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = List,
        modifier = modifier
    ) {
        composable<List> {
            TaskListScreen(navController, repository)
        }
        composable<Add> {
            AddTaskScreen(navController, repository)
        }
    }
}
