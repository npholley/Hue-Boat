package com.nicholasholley.dev.hueboat.ui.common

import android.os.Bundle
import android.support.v4.app.Fragment
import com.nicholasholley.dev.hueboat.util.Constants

abstract class BaseFragment : Fragment() {
    fun <T : BaseKey> getKey(): T? = arguments?.getParcelable<T>(Constants.NAV_KEY)

    abstract fun bindToVM()
}