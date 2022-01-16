package com.als.genericinkotlinmvvm.view

import androidx.fragment.app.Fragment
import com.als.genericinkotlinmvvm.BaseApp
import com.als.genericinkotlinmvvm.TextHelper
import javax.inject.Inject

/**
 * Базовый фрагмент, в который можно делать инжекты ни как не связан с какой либо виьмоделью
 */
abstract class BaseForInjectFragment : Fragment() {

    @Inject
    lateinit var textHelper: TextHelper

    init {
        BaseApp.appComponent.inject(this)
    }
}
