package com.jinyeob.eqt

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jinyeob.domain.model.MccheyneItem
import com.jinyeob.domain.repository.MccheyneRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(mccheyneRepository: MccheyneRepository) :
    ViewModel() {
    val mccheyneFlow = mccheyneRepository.getMccheyneItems()

    lateinit var mccheyneItem: MccheyneItem
    var currentSelectedDate: ObservableField<Date> = ObservableField(Date())
}
