package br.com.android_mvp_intent_sample.mock

import br.com.android_mvp_intent_sample.HandOutModel

object HandoutMockDataSource {

    fun getMock(): HandOutModel {

        return HandOutModel (
            code = "VIP-777",
            showAttribute = true
        )
    }
}
