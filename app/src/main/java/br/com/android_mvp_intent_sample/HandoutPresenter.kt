package br.com.android_mvp_intent_sample

class HandoutPresenter(
    private val view: HandoutContract.View
): HandoutContract.Presenter {

    override fun onOpenHandoutClicked(code: String) {
        val showAttribute = code.startsWith(prefix = "VIP")
        view.navigateToHandout(
            code = code,
            showAttribute = showAttribute
        )
    }

}