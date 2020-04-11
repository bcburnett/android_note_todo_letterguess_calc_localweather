package com.newlondonweb.tabbedfragmentdemo

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.newlondonweb.tabbedfragmentdemo.R.string.*
import com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.*

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val TAB_TITLES = arrayOf(tab_text_1,tab_text_2,tab_text_3, tab_text_4, tab_text_6, tab_text_5)
    private val FRAGMENTS:ArrayList<Fragment> = arrayListOf(
        NoteFragment.getInstance(),
        WordGuessFragment.getInstance(),
        CalcFragment.getInstance(),
        ToDoFrag.getInstance(),
        WeatherFragment.getInstance(),
        UtilityFragment.getInstance()
    )

    override fun getItem(position: Int)=FRAGMENTS[position]

    override fun getPageTitle(position: Int)=context.resources.getString(TAB_TITLES[position])

    override fun getCount()= FRAGMENTS.size


}