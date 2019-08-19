package com.newlondonweb.tabbedfragmentdemo

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.newlondonweb.tabbedfragmentdemo.R.string.*
import com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.*

private val TAB_TITLES = arrayOf(tab_text_1,tab_text_2,tab_text_3, tab_text_4, tab_text_6, tab_text_5)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        // getItem is called when the position changes to instantiate the fragment for the given page.
        // Returns a Fragment instance.
        return when (position){
            0 -> NoteFragment.newInstance()
            1 -> WordGuessFragment.newInstance()
            2 -> CalcFragment.newInstance()
            3->ToDoFrag.newInstance()
            4->WeatherFragment.newInstance()
            else -> UtilityFragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 6
    }
}