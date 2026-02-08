package br.com.android_mvp_intent_sample

interface HandoutContract {
    interface View {
        fun navigateToHandout(code: String, showAttribute: Boolean)
    }

    interface Presenter {
        fun onOpenHandoutClicked(code: String)
    }
}