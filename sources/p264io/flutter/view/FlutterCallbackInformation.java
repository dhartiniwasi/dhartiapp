package p264io.flutter.view;

import androidx.annotation.Keep;
import p264io.flutter.embedding.engine.FlutterJNI;

@Keep
/* renamed from: io.flutter.view.FlutterCallbackInformation */
public final class FlutterCallbackInformation {
    public final String callbackClassName;
    public final String callbackLibraryPath;
    public final String callbackName;

    private FlutterCallbackInformation(String str, String str2, String str3) {
        this.callbackName = str;
        this.callbackClassName = str2;
        this.callbackLibraryPath = str3;
    }

    public static FlutterCallbackInformation lookupCallbackInformation(long j) {
        return FlutterJNI.nativeLookupCallbackInformation(j);
    }
}
