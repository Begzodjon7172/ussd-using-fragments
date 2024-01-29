package com.example.ussdfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdfragment.adapters.UssdAdapter
import com.example.ussdfragment.databinding.FragmentListBinding
import com.example.ussdfragment.models.MyUssd


class ListFragment : Fragment() {


    private lateinit var binding: FragmentListBinding
    private lateinit var ussdAdapter: UssdAdapter
    private lateinit var list: ArrayList<MyUssd>
    private lateinit var map: HashMap<String, ArrayList<MyUssd>>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        list = ArrayList()

        loadData()

        val str = arguments?.getString("str")
        list = map[str]!!

        ussdAdapter = UssdAdapter(list) {
            val infoFragment = InfoFragment()
            val bundle = Bundle()
            bundle.putSerializable("key", it)
            infoFragment.arguments = bundle
            parentFragmentManager.beginTransaction()
                .replace(R.id.my_container, infoFragment)
                .addToBackStack("")
                .commit()
        }

        binding.rv.adapter = ussdAdapter



        return binding.root
    }

    private fun loadData() {
        map = HashMap()

        val list1 = ArrayList<MyUssd>()
        list1.add(MyUssd("<<60 daqiqa>>", "*104*10#", "To'plamga kiritilgan daqiqalar 60 daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list1.add(MyUssd("<<120 daqiqa>>", "*105*40#", "To'plamga kiritilgan daqiqalar 120 daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list1.add(MyUssd("<<180 daqiqa>>", "*106*60#", "To'plamga kiritilgan daqiqalar 180 daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list1.add(MyUssd("<<300 daqiqa>>", "*107*20#", "To'plamga kiritilgan daqiqalar 300 daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list1.add(MyUssd("<<360 daqiqa>>", "*108*80#", "To'plamga kiritilgan daqiqalar 360 daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list1.add(MyUssd("<<480 daqiqa>>", "*109*40#", "To'plamga kiritilgan daqiqalar 480 daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))

        map["daqiqa"] = list1


        val list2 = ArrayList<MyUssd>()
        list2.add(
            MyUssd(
                "<<60 mb internet>>",
                "*103*60#",
                "To'plamga kiritilgan internet paketi 60 mb daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"
            )
        )
        list2.add(
            MyUssd(
                "<<120 mb internet>>",
                "*103*60#",
                "To'plamga kiritilgan internet paketi 120 mb daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"
            )
        )
        list2.add(
            MyUssd(
                "<<180 mb internet>>",
                "*103*60#",
                "To'plamga kiritilgan internet paketi 180 mb daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"
            )
        )
        list2.add(
            MyUssd(
                "<<300 mb internet>>",
                "*103*60#",
                "To'plamga kiritilgan internet paketi 300 mb daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"
            )
        )
        list2.add(
            MyUssd(
                "<<360 mb internet>>",
                "*103*60#",
                "To'plamga kiritilgan internet paketi 360 mb daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"
            )
        )
        list2.add(
            MyUssd(
                "<<480 mb internet>>",
                "*103*60#",
                "To'plamga kiritilgan internet paketi 480 mb daqiqa. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"
            )
        )

        map["internet"] = list2


        val list3 = ArrayList<MyUssd>()
        list3.add(MyUssd("<<60 sms>>", "*103*60#", "To'plamga kiritilgan sms 60 ta. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list3.add(MyUssd("<<120 sms>>", "*103*60#", "To'plamga kiritilgan sms 120 ta. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list3.add(MyUssd("<<180 sms>>", "*103*60#", "To'plamga kiritilgan sms 180 ta. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list3.add(MyUssd("<<300 sms>>", "*103*60#", "To'plamga kiritilgan sms 300 ta. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list3.add(MyUssd("<<360 sms>>", "*103*60#", "To'plamga kiritilgan sms 360 ta. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))
        list3.add(MyUssd("<<480 sms>>", "*103*60#", "To'plamga kiritilgan sms 480 ta. To'plam narxi toplam faollashtirilganidan song yechib olinadi. To'plam amal qilish muddati faollashtirilgan kundan boshlab 30 kalendar kuni. Faollashtirilgan to'plamda to'plam qoldig'ini bilish : USSD - buyruq: *103# SMS-yordamchi : 616020 raqamiga 3"))

        map["sms"] = list3


        val list4 = ArrayList<MyUssd>()
        list4.add(
            MyUssd(
                "<<Mobi 60>>",
                "*103*60#",
                "20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga 20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga"
            )
        )
        list4.add(
            MyUssd(
                "<<Mobi 120>>",
                "*103*60#",
                "20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga 20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga)"
            )
        )
        list4.add(
            MyUssd(
                "<<Mobi 180>>",
                "*103*60#",
                "20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga 20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga)"
            )
        )
        list4.add(
            MyUssd(
                "<<Mobi 300>>",
                "*103*60#",
                "20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga 20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga)"
            )
        )
        list4.add(
            MyUssd(
                "<<Mobi 360>>",
                "*103*60#",
                "20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga 20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga)"
            )
        )
        list4.add(
            MyUssd(
                "<<Mobi 480>>",
                "*103*60#",
                "20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga 20 000 /1 000 so'm oylik / kunlik abonet to'lovi 500/17 daqiqa (oyiga/kuniga) Ozbekiston boyicha chiquvchu=i qongiroqlar 1 500/50 Mb (oyiga/kuniga) 500/17 sms Ozbekiston botyicha qongiroqlarning bir daqiqasi 42.10 so'm Ozbekiston boshqa mobil operatorlariga"
            )
        )

        map["tarif"] = list4
    }

}