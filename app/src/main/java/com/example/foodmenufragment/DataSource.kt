package com.example.foodmenufragment

class DataSource {

    fun loadFoodMenu() : List<DataClass>{
        return listOf(
            DataClass( R.string.beans, R.string.price_1, R.drawable.beans, R.string.beans_detail ),
            DataClass( R.string.beans_plantain, R.string.price_2, R.drawable.beans_plantain, R.string.beans_plantain_detail ),
            DataClass( R.string.brown_rice, R.string.price_3, R.drawable.brown_rice, R.string.brown_rice_detail ),
            DataClass( R.string.custard, R.string.price_4, R.drawable.custard, R.string.custard_detail ),
            DataClass( R.string.egusi_soup, R.string.price_5, R.drawable.egusi_soup, R.string.egusi_soup_detail ),
            DataClass( R.string.fried_rice, R.string.price_6, R.drawable.fried_rice, R.string.fried_rice_detail ),
            DataClass( R.string.jollof_rice, R.string.price_7, R.drawable.jollof_rice, R.string.jollof_rice_detail ),
            DataClass( R.string.ofada_and_sauce, R.string.price_8, R.drawable.ofada_and_sauce, R.string.ofada_and_sauce_detail ),
            DataClass( R.string.ofada_and_stew, R.string.price_9, R.drawable.ofada_and_stew, R.string.ofada_and_stew_detail ),
            DataClass( R.string.oziza_soup, R.string.price_10, R.drawable.oziza_soup, R.string.oziza_soup_detail ),
            DataClass( R.string.pap, R.string.price_11, R.drawable.pap, R.string.pap_detail ),
            DataClass( R.string.steamed_rice, R.string.price_12, R.drawable.steamed_rice, R.string.steamed_rice_detail ),
            DataClass( R.string.tea_and_sandwich, R.string.price_13, R.drawable.tea_and_sandwich, R.string.tea_and_sandwich_detail ),
            DataClass( R.string.vegie_fried_rice, R.string.price_14, R.drawable.vegie_fried_rice, R.string.vegie_fried_rice_detail ),
            DataClass( R.string.yam_and_sauce, R.string.price_15, R.drawable.yam_and_sauce, R.string.yam_and_sauce_detail )
        )
    }

}