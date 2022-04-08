package io.github.tuguzt.tabbedapplication.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.github.tuguzt.tabbedapplication.R

/**
 * A [FragmentStateAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    companion object {
        val TAB_TITLES = arrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2,
        )
    }

    override fun getItemCount(): Int = TAB_TITLES.size

    override fun createFragment(position: Int): Fragment =
        PlaceholderFragment.newInstance(position + 1)
}
