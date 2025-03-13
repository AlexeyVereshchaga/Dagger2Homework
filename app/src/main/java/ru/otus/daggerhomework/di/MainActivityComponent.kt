package ru.otus.daggerhomework.di

import android.app.Activity
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.flow.MutableStateFlow
import ru.otus.daggerhomework.Event
import javax.inject.Named

@ActivityScope
@Component(modules = [MainActivityModule::class])
interface MainActivityComponent {
    @Component.Factory
    interface Factory {
        fun build(@BindsInstance @ActivityContext context: Context): MainActivityComponent
    }

    fun event(): MutableStateFlow<Event>

    @ActivityContext
    fun getContext(): Context
}
