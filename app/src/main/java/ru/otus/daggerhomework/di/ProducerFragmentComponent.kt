package ru.otus.daggerhomework.di

import dagger.Component
import ru.otus.daggerhomework.ProducerViewModel

@Component(
    dependencies = [MainActivityComponent::class],
    modules = [ProducerModule::class]
)
@FragmentScope
interface ProducerFragmentComponent {

    @Component.Factory
    interface Factory {
        fun build(
            mainActivityComponent: MainActivityComponent
        ): ProducerFragmentComponent
    }

    fun viewModel(): ProducerViewModel

}