package br.com.android_mvp_intent_sample

import br.com.android_mvp_intent_sample.mock.HandoutMockDataSource

class HandoutPresenter(
    private val view: HandoutContract.View
): HandoutContract.Presenter {

    override fun onOpenHandoutClicked(model: HandOutModel) {
        val data = HandoutMockDataSource.getMock()

        if (data.showAttribute) {
            view.openRetention(data.code)
        }

        view.openHandout(
            code = data.code,
            showAttribute = data.showAttribute
        )
    }

}