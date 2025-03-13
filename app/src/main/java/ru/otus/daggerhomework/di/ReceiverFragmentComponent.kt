package ru.otus.daggerhomework.di

import dagger.Component
import ru.otus.daggerhomework.ReceiverViewModel

@Component(
    dependencies = [MainActivityComponent::class, ApplicationComponent::class],
    modules = [ReceiverModule::class]
)
@FragmentScope
interface ReceiverFragmentComponent {

    @Component.Factory
    interface Factory {
        fun build(
            applicationComponent: ApplicationComponent,
            mainActivityComponent: MainActivityComponent
        ): ReceiverFragmentComponent
    }

    fun viewModel(): ReceiverViewModel
}