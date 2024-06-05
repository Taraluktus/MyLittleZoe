package de.michawallo.mylittlezoe.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

  private val _text = MutableLiveData<String>().apply {
    value = "My Little Zoe"
  }
  val text: LiveData<String> = _text
}