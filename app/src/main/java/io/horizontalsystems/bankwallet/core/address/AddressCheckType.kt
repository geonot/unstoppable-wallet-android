package io.horizontalsystems.bankwallet.core.address

import io.horizontalsystems.bankwallet.R

enum class AddressCheckType {
    Phishing,
    Blacklist,
    Sanction;

    val title: Int
        get() = when (this) {
            Phishing -> R.string.Send_Address_PhishingCheck
            Blacklist -> R.string.Send_Address_BlacklistCheck
            Sanction -> R.string.Send_Address_SanctionCheck
        }

    val detectedErrorTitle: Int
        get() = when (this) {
            Phishing -> R.string.Send_Address_ErrorMessage_PhishingDetected
            Blacklist -> R.string.Send_Address_ErrorMessage_BlacklistDetected
            Sanction -> R.string.Send_Address_ErrorMessage_SanctionDetected
        }

    val detectedErrorDescription: Int
        get() = when (this) {
            Phishing -> R.string.Send_Address_ErrorMessage_PhishingDetected_Description
            Blacklist -> R.string.Send_Address_ErrorMessage_BlacklistDetected_Description
            Sanction -> R.string.Send_Address_ErrorMessage_SanctionDetected_Description
        }

}
