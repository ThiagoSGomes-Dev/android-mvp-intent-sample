package br.com.android_mvp_intent_sample

interface HandoutContract {
    interface View {
        fun openRetention(code: String)
        fun openHandout(code: String, showAttribute: Boolean)
    }

    interface Presenter {
        fun onOpenHandoutClicked(model: HandOutModel)
    }
}