package br.com.android_mvp_intent_sample.mock

import br.com.android_mvp_intent_sample.HandOutModel

object HandoutMockDataSource {

    fun getMock(): HandOutModel {
        // simulando parse de JSON
        return HandOutModel (
            code = "VIP-777",
            showRetention = true
        )
    }
}
