package com.als.genericinkotlinmvvm

import com.als.genericinkotlinmvvm.view.BaseForInjectFragment
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        MainModule::class
    ]
)
@Singleton
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        fun mainModule(mainModule: MainModule): Builder
    }

    fun inject(baseForInjectFragment: BaseForInjectFragment)
}
