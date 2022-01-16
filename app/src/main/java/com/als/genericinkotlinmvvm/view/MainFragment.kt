package com.als.genericinkotlinmvvm.view

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.als.genericinkotlinmvvm.BaseApp
import com.als.genericinkotlinmvvm.databinding.FragmentMainBinding
import com.als.genericinkotlinmvvm.viewmodel.MainViewModel

class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>(FragmentMainBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        BaseApp.appComponent.inject(this)
        viewModel.getLiveData().observe(viewLifecycleOwner, Observer { binding.textView.text = textHelper.toUpp(it) })
        viewModel.load()
    }
}
