package ru.otus.daggerhomework

sealed class Event {
    data class PopulateColor(
        val color: Int
    ) : Event()
}