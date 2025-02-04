package ru.yandex.architectureproject.presentation.state

sealed interface TaskAction {
    data object LoadTasks : TaskAction
    data class AddTask(val taskText: String) : TaskAction
    data class UpdateTaskStatus(val taskId: Int, val complete: Boolean) : TaskAction
    data class DeleteTask(val taskId: Int) : TaskAction

}
