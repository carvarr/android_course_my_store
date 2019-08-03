package curso.carlos.mystore.helpers

import android.security.ConfirmationCallback
import android.util.Log

class ImageConfirmationCallback : ConfirmationCallback() {
    override fun onConfirmed(dataThatWasConfirmed: ByteArray?) {
        super.onConfirmed(dataThatWasConfirmed)
        // Sign dataThatWasConfirmed using your generated signing key.
        // By completing this process, you generate a "signed statement".
        Log.i("ConfirmationCallback", "OnConfirmedCalled")
    }

    override fun onDismissed() {
        super.onDismissed()
        Log.i("ConfirmationCallback", "OnDismissedCalled")
    }

    override fun onCanceled() {
        super.onCanceled()
        Log.i("ConfirmationCallback", "OnCanceledCalled")
    }

    override fun onError(e: Throwable?) {
        super.onError(e)
        Log.i("ConfirmationCallback", "OnErrorCalled", e)
    }

}

data class ImageConfirmationPromptData(val uri: String)