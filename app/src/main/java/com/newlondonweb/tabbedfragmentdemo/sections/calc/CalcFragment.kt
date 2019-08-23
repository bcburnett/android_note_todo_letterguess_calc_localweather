package com.newlondonweb.tabbedfragmentdemo.sections.calc

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.newlondonweb.tabbedfragmentdemo.R.layout.frag3_fragment
import kotlinx.android.synthetic.main.frag3_fragment.*

class CalcFragment : Fragment() {


    companion object {fun newInstance() = CalcFragment() }

    private val vm: CalcViewModel by lazy {this.activity.let { ViewModelProvider(it!!).get(
        CalcViewModel::class.java)}}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(
        frag3_fragment,
        container,
        false
    )

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        tally.movementMethod = ScrollingMovementMethod()


        vm.display.observe(this, Observer { textView2.text = it.toString() })

        vm.tallyRegister.observe(this, Observer {
            tally.text = it.toString()
            tally.scrollY=(0)
        })

        ac.setOnClickListener { vm.ac() }
        cl_Numbers.children.forEach {
            it.setOnClickListener { numClick(it) }
        }

        percent.setOnClickListener { vm.percent() }
        flip.setOnClickListener { vm.flip() }
        sqrt.setOnClickListener { vm.sqrt() }

        buttonDiv.setOnClickListener { funClick(it) }
        buttonMul.setOnClickListener { funClick(it) }
        buttonMinus.setOnClickListener { funClick(it) }
        buttonPlus.setOnClickListener { funClick(it) }

        buttonEnter.setOnClickListener { vm.eq() }
    }


    private fun numClick(view: View) = vm.numClick((view as Button).text.toString())

    private fun funClick(view: View) = vm.funClick((view as Button).text.toString())
}


