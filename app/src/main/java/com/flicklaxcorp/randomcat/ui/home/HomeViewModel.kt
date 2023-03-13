package com.flicklaxcorp.randomcat.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.flicklaxcorp.randomcat.api.CatService
import com.flicklaxcorp.randomcat.api.dto.CatResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val catService: CatService
) : ViewModel() {

    private val _state = MutableStateFlow(
        CatResponse(imageUrl = "")
    )
    val state: StateFlow<CatResponse>
        get() = _state


    init {
        viewModelScope.launch {
            val resp = catService.getRandomCatImage()
            _state.value = resp;

            Timber.d(resp.imageUrl)

        }

    }

}